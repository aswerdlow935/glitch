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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc862.util.FaultCode;
import org.usfirst.frc862.util.Logger;
import com.kauailabs.navx.frc.AHRS;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveTrainLeft1;
    public static WPI_TalonSRX driveTrainLeft2;
    public static WPI_TalonSRX driveTrainLeft3;
    public static WPI_TalonSRX driveTrainRight1;
    public static WPI_TalonSRX driveTrainRight2;
    public static WPI_TalonSRX driveTrainRight3;
    public static Compressor coreCompressor;
    public static PowerDistributionPanel corePowerDistributionPanel;
    public static DoubleSolenoid shifterShift;
    public static SpeedController gripperLeftGripper;
    public static SpeedController gripperRightGripper;
    public static WPI_TalonSRX fourBarmotor;
    public static WPI_TalonSRX elevatormotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static AHRS navx;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeft1 = new WPI_TalonSRX(1);
        
        
        driveTrainLeft2 = new WPI_TalonSRX(2);
        
        
        driveTrainLeft3 = new WPI_TalonSRX(3);
        
        
        driveTrainRight1 = new WPI_TalonSRX(4);
        
        
        driveTrainRight2 = new WPI_TalonSRX(5);
        
        
        driveTrainRight3 = new WPI_TalonSRX(6);
        
        
        coreCompressor = new Compressor(11);
        LiveWindow.addActuator("Core", "Compressor", coreCompressor);
        
        corePowerDistributionPanel = new PowerDistributionPanel(10);
        LiveWindow.addSensor("Core", "PowerDistributionPanel", corePowerDistributionPanel);
        
        shifterShift = new DoubleSolenoid(11, 0, 1);
        LiveWindow.addActuator("Shifter", "Shift", shifterShift);
        
        gripperLeftGripper = new Spark(0);
        LiveWindow.addActuator("Gripper", "LeftGripper", (Spark) gripperLeftGripper);
        gripperLeftGripper.setInverted(false);
        gripperRightGripper = new Spark(1);
        LiveWindow.addActuator("Gripper", "RightGripper", (Spark) gripperRightGripper);
        gripperRightGripper.setInverted(false);
        fourBarmotor = new WPI_TalonSRX(7);
        
        
        elevatormotor = new WPI_TalonSRX(8);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        resetNavX();

        fourBarmotor.setSelectedSensorPosition(0, 0, Constants.TALON_TIMEOUT);
    }

    public static void resetNavX() {
        Logger.debug("Wait a bit");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        if (navx == null) {
            navx = new AHRS(edu.wpi.first.wpilibj.I2C.Port.kMXP);
//            navx = new AHRS(edu.wpi.first.wpilibj.SPI.Port.kMXP);
//            navx = new AHRS(SerialPort.Port.kUSB, AHRS.SerialDataType.kProcessedData, (byte) 50);
        }
        Logger.debug("Navx: " + navx);

        if (navx == null) {
            FaultCode.write(FaultCode.Codes.NAVX_ERROR);
        } else {
            Logger.debug("Firmware version: " + navx.getFirmwareVersion());
            for (int i = 0; i < 10 && !navx.isConnected(); ++i) {
                try {
                    Logger.debug("Attempt reset");
                    navx.reset();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // do nothing
                }
            }

            if (navx.isConnected()) {
                Logger.debug("We have a connected navx");
                LiveWindow.addSensor("DriveTrain", "NavX", navx);
            } else {
                Logger.error("Failed to connect navx");
                FaultCode.write(FaultCode.Codes.NAVX_ERROR, "Not connected - sad");
            }
            Logger.flush();
        }
    }

}
