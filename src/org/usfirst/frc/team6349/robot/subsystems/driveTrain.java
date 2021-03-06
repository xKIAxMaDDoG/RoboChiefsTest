// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6349.robot.subsystems;

import org.usfirst.frc.team6349.robot.Robot;
import org.usfirst.frc.team6349.robot.RobotMap;
import org.usfirst.frc.team6349.robot.commands.*;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
	

/**
 *
 */
public class driveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController speedController1 = RobotMap.driveTrainSpeedController1;
    private final SpeedController speedController2 = RobotMap.driveTrainSpeedController2;
    private final SpeedControllerGroup leftSpark = RobotMap.driveTrainleftSpark;
    private final SpeedController speedController3 = RobotMap.driveTrainSpeedController3;
    private final SpeedController speedController4 = RobotMap.driveTrainSpeedController4;
    private final SpeedControllerGroup rightSpark = RobotMap.driveTrainrightSpark;
    private final DifferentialDrive diffDrive1 = RobotMap.driveTraindiffDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new driveWithcontroller());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

   
    }
    public void driveWithController(double left,double right) {
    	diffDrive1.tankDrive(left, right);
    }
    public void autoWalk() {
    	Robot.driveTrain.driveWithController(-.6, -.6);
    }
    public void driveStop() {
    	diffDrive1.stopMotor();
    }
    public void driveBrake() {
    	Robot.driveTrain.driveWithController(.1, .1);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

