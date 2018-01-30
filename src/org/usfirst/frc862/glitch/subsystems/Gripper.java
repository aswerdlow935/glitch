// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc862.glitch.subsystems;

import org.usfirst.frc862.glitch.RobotMap;
import org.usfirst.frc862.glitch.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Gripper extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftGripper = RobotMap.gripperLeftGripper;
    private final SpeedController rightGripper = RobotMap.gripperRightGripper;
    private WaitForCube waitForCube;
    private WaitWithCube waitWithCube;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new WaitForCube());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        waitForCube = new WaitForCube();
        waitWithCube = new WaitWithCube();

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public void startWaitForCube(){
        waitForCube.start();
    }

    public void startWaitWithCube(){
        waitWithCube.start();
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void stopIntake() {
        leftGripper.set(0);
        rightGripper.set(0);
    }

    public void collectCube() {
        leftGripper.set(1);
        rightGripper.set(1);
    }

    //Fix
    public void holdCube() {
        leftGripper.set(1);
        rightGripper.set(1);
    }

    public void ejectCube() {
        leftGripper.set(-1);
        rightGripper.set(-1);
    }

    public boolean hasCube() {
        return false;
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}
