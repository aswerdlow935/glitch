// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc862.glitch;

import com.team254.lib.util.ConstantsBase;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc862.glitch.commands.*;
import org.usfirst.frc862.glitch.subsystems.*;
import org.usfirst.frc862.util.DataLogger;
import org.usfirst.frc862.util.Logger;
import org.usfirst.frc862.util.Looper;

import javax.xml.crypto.Data;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Core core;
    public static Shifter shifter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static RobotStateEstimator robotStateEstimator;
    private Looper fastLooper;
    private Looper slowLooper;

    public static void resetLoggingFiles() {
        DriverStation ds = DriverStation.getInstance();
        String fn = "robot";
        switch (ds.getMatchType()) {
            case Practice:
                fn = String.format("practice-%d-%d", ds.getMatchNumber(), ds.getReplayNumber());
                break;

            case Qualification:
                fn = String.format("qual-%d-%d", ds.getMatchNumber(), ds.getReplayNumber());
                break;

            case Elimination:
                fn = String.format("elim-%d-%d", ds.getMatchNumber(), ds.getReplayNumber());
                break;

            default:
                break;
        }
        Logger.setBaseFileName(fn);
        DataLogger.setBaseFileName(fn);
    }

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        core = new Core();
        shifter = new Shifter();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        robotStateEstimator = new RobotStateEstimator(driveTrain);

        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // Add commands to Autonomous Sendable Chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        SmartDashboard.putData("Auto mode", chooser);
        Robot.resetLoggingFiles();

        slowLooper = new Looper(Constants.slowLoopRate);
        fastLooper = new Looper(Constants.fastLoopRate);

        slowLooper.register(Logger.getWriter());
        slowLooper.register(DataLogger.getLogger().getLogWriter());
        fastLooper.register(DataLogger.getLogger());

        slowLooper.start();
        fastLooper.start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit() {
        DataLogger.flush();
        Logger.getWriter().flush();
    }

    @Override
    public void disabledPeriodic() { Scheduler.getInstance().run(); }

    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() { Scheduler.getInstance().run(); }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    @Override
    public void teleopPeriodic() { Scheduler.getInstance().run(); }
}
