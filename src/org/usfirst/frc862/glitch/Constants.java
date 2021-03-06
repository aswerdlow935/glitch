package org.usfirst.frc862.glitch;

import java.io.File;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc862.util.ConstantsBase;
import org.usfirst.frc862.util.LightningMath;

public class Constants extends ConstantsBase {
    // Note this is final, it will not be
    // in the config file, and if you put
    // it there, the value will be ignored
    // as the value here in the code is 
    // immutable

    //Logging
    public static int logDepth = 1000;



    /*DRIVE TRAIN*/
    // NOTE we are going to want to tune for high/low gear with
    // at the very least a different feed forward...
    // in inches
    public static double WheelCircumference = 4 * Math.PI;
    public static double PHYSICAL_MAX_LOW_SPEED_TICKS = 800;
    public static double PHYSICAL_MAX_HIGH_SPEED_TICKS = 1800;

    public static double dead_band = 0.05;
    public static int TALON_TIMEOUT = 10; //ms

    // not currently functional
    public static final int LOWGEAR_IDX = 0;
    public static final int HIGHGEAR_IDX = 1;

    // low gear
    public static double LOWGEAR_DRIVE_P = 1.5;  // 2 oscillated a little in testing
    public static double LOWGEAR_DRIVE_I = 0;
    public static double LOWGEAR_DRIVE_D = 0;
    public static double LOWGEAR_DRIVE_F = 1023 / PHYSICAL_MAX_LOW_SPEED_TICKS;
    public static final int LOWGEAR_ALLOWED_DRIVE_ERROR = 20;

    // high gear
    public static double HIGHGEAR_DRIVE_P = 0.75;
    public static double HIGHGEAR_DRIVE_I = 0;
    public static double HIGHGEAR_DRIVE_D = 0;
    public static double HIGHGEAR_DRIVE_F = 1023 / PHYSICAL_MAX_HIGH_SPEED_TICKS;
    public static final int HIGHGEAR_ALLOWED_DRIVE_ERROR = 40;
    public static double TICS_PER_ROTATION = 360 * 4;

    // PID gains for drive velocity loop (HIGH GEAR)
    // Units: setpoint, error, and output are in inches per second.
    public static double kDriveHighGearVelocityKp = 1.2;
    public static double kDriveHighGearVelocityKi = 0.0;
    public static double kDriveHighGearVelocityKd = 6.0;
    public static double kDriveHighGearVelocityKf = .15;
    public static int kDriveHighGearVelocityIZone = 0;
    public static double kDriveHighGearVelocityRampRate = 240.0;
    public static double kDriveHighGearNominalOutput = 0.5;
    public static double kDriveHighGearMaxSetpoint = 17.0 * 12.0; // 17 fps



    /* ROBOT PHYSICAL CONSTANTS */
    //TODO tune for glitch

    // Wheels
    public static double kDriveWheelDiameterInches = 3.419;
    public static double kTrackWidthInches = 26.655;
    public static double kTrackScrubFactor = 0.924;

    // Geometry
    public static double kCenterToFrontBumperDistance = 16.33;
    public static double kCenterToIntakeDistance = 23.11;
    public static double kCenterToRearBumperDistance = 16.99;
    public static double kCenterToSideBumperDistance = 17.225;

    // Pose of the camera frame w.r.t. the robot frame
    public static double kCameraXOffset = -3.3211;
    public static double kCameraYOffset = 0.0;
    public static double kCameraZOffset = 20.9;
    public static double kCameraPitchAngleDegrees = 29.56; // Measured on 4/26
    public static double kCameraYawAngleDegrees = 0.0;
    public static double kCameraDeadband = 0.0;

    // Path following constants
    public static double kMinLookAhead = 12.0; // inches
    public static double kMinLookAheadSpeed = 9.0; // inches per second
    public static double kMaxLookAhead = 24.0; // inches
    public static double kMaxLookAheadSpeed = 120.0; // inches per second
    public static double kDeltaLookAhead = kMaxLookAhead - kMinLookAhead;
    public static double kDeltaLookAheadSpeed = kMaxLookAheadSpeed - kMinLookAheadSpeed;

    public static double kInertiaSteeringGain = 0.0; // angular velocity command is multiplied by this gain *
                                                    // our speed in inches per second



    /*PATH FOLLOWER*/
    public static double kSegmentCompletionTolerance = 0.1; // inches
    public static double kPathFollowingMaxAccel = 120.0; // inches per second^2
    public static double kPathFollowingMaxVel = 120.0; // inches per second
    public static double kPathFollowingProfileKp = 5.00;
    public static double kPathFollowingProfileKi = 0.03;
    public static double kPathFollowingProfileKv = 0.02;
    public static double kPathFollowingProfileKffv = 1.0;
    public static double kPathFollowingProfileKffa = 0.05;
    public static double kPathFollowingGoalPosTolerance = 0.75;
    public static double kPathFollowingGoalVelTolerance = 12.0;
    public static double kPathStopSteeringDistance = 9.0;

    //PID
    // TODO Set these
    public static double pathP = 5;
    public static double pathI = 0;
    public static double pathD = 0;
    public static double pathV = 1;  // Velocity is in IPS, we command IPS
    public static double pathA = 0.1;
    public static double pathTurn = 0;


    // Goal tracker constants
    public static double kMaxGoalTrackAge = 1.0;
    public static double kMaxTrackerDistance = 18.0;
    public static double kCameraFrameRate = 30.0;
    public static double kTrackReportComparatorStablityWeight = 1.0;
    public static double kTrackReportComparatorAgeWeight = 1.0;

    // Self test values
    public static double MotorTestPower = 0.3;
    public static double MotorTestDistance = 3;

    public static double slowLoopRate = 0.5;
    public static double fastLoopRate = 0.05;
    public static double openLoopRamp = 0.2;
    public static double closedLoopRamp = 0.2;



    /*AUTOSHIFTER*/
    public static double MinUpshiftVelocity = LightningMath.talon2ips(750);  // TODO calibrate me
    public static double MinRequestedVelocityForUpshift = LightningMath.talon2ips(800); // TODO calibrate me
    public static double shiftHysteresis = 1.0;
    public static double HighCurrentThreshold = 200;
    public static double highCurrentTimeout = 0.150;
    public static double CrashDeacceleration = -12;
    public static double CoastVelocity = LightningMath.talon2ips(400);
    public static double CoastTriggerTime = 0.1;
    public static double slowDownRate = 0.95;



    /*AUTO STRAIGHTEN*/
    public static double NotTurning = 0.01;
    public static double NotStraight = 0.1;
    public static double StraightMarginOfError = 1.5;
    public static double StraightenKpLowGear = 0; // -0.005;
    public static double StraightenKpHighGear = 0; // -0.01;



    /*FOURBAR*/
    //PID
    // TODO Calibrate
    public static final int ALLOWABLE_FOURBAR_ERROR = 0;
    public static double FOURBAR_P = SmartDashboard.getNumber("Fourbar P",20);
    public static double FOURBAR_I = SmartDashboard.getNumber("Fourbar I",0);
    public static double FOURBAR_D = SmartDashboard.getNumber("Fourbar D",0);
    public static double FOURBAR_F = SmartDashboard.getNumber("Fourbar F",0);

    // Positions in encoder ticks MAX: ~300
    public static final double FOURBAR_SCALE_POS = 290;
    public static final double FOURBAR_SWITCH_POS = 100;
    public static final double FOURBAR_COLLECT_POS = 25;
    public static final double FOURBAR_BOTTOM_POS = 10;

    public String getFileName() {
        return "~/glitch.yaml";
    }

    static {
//        Constants.lookupTable = new InterpolatedMap();
//        Constants.lookupTable.put(1.0, 1.0);
//        Constants.lookupTable.put(50.0, 2500.0);
//        Constants.lookupTable.put(100.0, 10000.0);

        File file = new File("/home/lvuser/echo");
        if (file.exists()) {
            // echo specific over-rides can go here
        }

        // new Constants().readFromFile();
    }

}
