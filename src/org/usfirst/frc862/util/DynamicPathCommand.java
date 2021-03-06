package org.usfirst.frc862.util;

import org.usfirst.frc862.util.FaultCode.Codes;
import org.usfirst.frc862.glitch.Constants;
import org.usfirst.frc862.glitch.Robot;
import org.usfirst.frc862.glitch.subsystems.DriveTrain;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.Trajectory;
import com.team254.lib.trajectory.TrajectoryFollower;
import com.team254.lib.trajectory.TrajectoryGenerator;
import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.util.ChezyMath;

import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.command.Command;

public class DynamicPathCommand extends Command {
    private CommandLogger logger;
    private TrajectoryFollower followerLeft = new TrajectoryFollower();
    private TrajectoryFollower followerRight = new TrajectoryFollower();
    private Notifier notifier;
    private double starting_heading;
    private Path path;

    public DynamicPathCommand() {
        super();
        setup();
    }
        
    public DynamicPathCommand(String name) {
        super(name);
        setup();
    }
        
    private void setup() {
        requires(Robot.driveTrain);

        notifier = new Notifier(()-> followPath());
        loadPath();

        if (isReversed()) {
            path.reverse();
        }
    }

    public Path getPath() {
        return null;
    }

    private boolean loadPath() {
        path = getPath();

        return path != null;
    }

    @Override
    protected void initialize() {
        // move this to ensure that we get a new log for each run
        logger = new CommandLogger(this.getName());
        logger.addDataElement("projected_left_pos");
        logger.addDataElement("requested_left_vel");
        logger.addDataElement("actual_left_pos");
        logger.addDataElement("projected_left_vel");
        logger.addDataElement("actual_left_vel");
        logger.addDataElement("projected_right_pos");
        logger.addDataElement("requested_right_pos");
        logger.addDataElement("actual_right_pos");
        logger.addDataElement("projected_right_vel");
        logger.addDataElement("actual_right_vel");
        logger.addDataElement("projected_heading");
        logger.addDataElement("actual_heading");
        logger.addDataElement("angle_diff");

        Robot.driveTrain.setVelocityMode();
//        Robot.shifter.downshift();
        
        if (!loadPath()) {
            Logger.error("Failed to load path");
        }

        Robot.driveTrain.resetDistance();
        starting_heading = Robot.core.getGyroAngle();
        followerLeft.configure(Constants.pathP, Constants.pathI, Constants.pathD, Constants.pathV, Constants.pathA);        
        followerRight.configure(Constants.pathP, Constants.pathI, Constants.pathD, Constants.pathV, Constants.pathA);

        followerLeft.setTrajectory(path.getLeftWheelTrajectory());
        followerLeft.reset();
        followerRight.setTrajectory(path.getRightWheelTrajectory());
        followerRight.reset();

        notifier.startPeriodic(path.getLeftWheelTrajectory().getSegment(0).dt);
    }

    private void followPath() {
        DriveTrain drive = Robot.driveTrain;
        double distanceL = drive.getLeftDistanceInches();
        double distanceR = drive.getRightDistanceInches();

        Trajectory.Segment left = followerLeft.getSegment();
        Trajectory.Segment right = followerRight.getSegment();
        
        double speedLeft = followerLeft.calculate(distanceL);
        double speedRight = followerRight.calculate(distanceR);
        
        double goalHeading = Math.toDegrees(followerLeft.getHeading());
        double observedHeading = ChezyMath.getDifferenceInAngleDegrees(Robot.core.getGyroAngle(), starting_heading);
        double angleDiff = ChezyMath.getDifferenceInAngleDegrees(observedHeading, goalHeading);

        double turn = Constants.pathTurn * angleDiff;
        double requestedLeft = speedLeft + turn;
        double requestedRight = speedRight - turn;
        
        drive.setVelocityIPS(requestedLeft, requestedRight);

        logger.set("projected_left_pos", left.pos);
        logger.set("requested_left_vel", requestedLeft);
        logger.set("actual_left_pos", distanceL);
        logger.set("projected_left_vel", left.vel);
        logger.set("actual_left_vel", drive.getLeftVelocityInchesPerSec());
        logger.set("projected_right_pos", right.pos);
        logger.set("requested_right_vel", requestedRight);
        logger.set("actual_right_pos", distanceR);
        logger.set("projected_right_vel", right.vel);
        logger.set("actual_right_vel", drive.getRightVelocityInchesPerSec());
        logger.set("projected_heading", ChezyMath.boundAngleNeg180to180Degrees(goalHeading));
        logger.set("actual_heading", observedHeading);
        logger.set("angle_diff", angleDiff);
        logger.write();
    }

    @Override
    protected void execute() {
        logger.drain();
    }

    @Override
    protected void end() {
        notifier.stop();
        logger.drain();
        logger.flush();
        logger.close();

        
        if (LightningMath.isZero(Robot.driveTrain.getLeftDistanceInches())) {
            FaultCode.write(Codes.LEFT_ENCODER_NOT_FOUND);
        }
        
        if (LightningMath.isZero(Robot.driveTrain.getRightDistanceInches())) {
            FaultCode.write(Codes.RIGHT_ENCODER_NOT_FOUND);
        }
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return followerLeft.isFinishedTrajectory() && 
                followerRight.isFinishedTrajectory();
    }

    public boolean isReversed() {
        return false;
    }

}
