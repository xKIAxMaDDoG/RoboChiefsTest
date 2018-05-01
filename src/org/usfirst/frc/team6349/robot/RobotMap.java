// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6349.robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.SPI;
import com.kauailabs.navx.frc.AHRS;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainSpeedController1;
    public static SpeedController driveTrainSpeedController2;
    public static SpeedControllerGroup driveTrainleftSpark;
    public static SpeedController driveTrainSpeedController3;
    public static SpeedController driveTrainSpeedController4;
    public static SpeedControllerGroup driveTrainrightSpark;
    public static DifferentialDrive driveTraindiffDrive1;
    public static WPI_TalonSRX intakeTalonSRX1;
    public static WPI_TalonSRX shooterTalonSRX1;
    public static PowerDistributionPanel pdpMonitorPowerDistributionPanel1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static AHRS navX;
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedController1 = new Spark(9);
        LiveWindow.addActuator("driveTrain", "Speed Controller 1", (Spark) driveTrainSpeedController1);
        driveTrainSpeedController1.setInverted(true);
        driveTrainSpeedController2 = new Spark(8);
        LiveWindow.addActuator("driveTrain", "Speed Controller 2", (Spark) driveTrainSpeedController2);
        driveTrainSpeedController2.setInverted(true);
        driveTrainleftSpark = new SpeedControllerGroup(driveTrainSpeedController1, driveTrainSpeedController2  );
        LiveWindow.addActuator("driveTrain", "leftSpark", driveTrainleftSpark);
        
        driveTrainSpeedController3 = new Spark(7);
        LiveWindow.addActuator("driveTrain", "Speed Controller 3", (Spark) driveTrainSpeedController3);
        driveTrainSpeedController3.setInverted(true);
        driveTrainSpeedController4 = new Spark(6);
        LiveWindow.addActuator("driveTrain", "Speed Controller 4", (Spark) driveTrainSpeedController4);
        driveTrainSpeedController4.setInverted(true);
        driveTrainrightSpark = new SpeedControllerGroup(driveTrainSpeedController3, driveTrainSpeedController4  );
        LiveWindow.addActuator("driveTrain", "rightSpark", driveTrainrightSpark);
        
        driveTraindiffDrive1 = new DifferentialDrive(driveTrainleftSpark, driveTrainrightSpark);
        LiveWindow.addActuator("driveTrain", "diffDrive1", driveTraindiffDrive1);
        driveTraindiffDrive1.setSafetyEnabled(true);
        driveTraindiffDrive1.setExpiration(0.1);
        driveTraindiffDrive1.setMaxOutput(1.0);

        pdpMonitorPowerDistributionPanel1 = new PowerDistributionPanel(10);
        LiveWindow.addSensor("pdpMonitor", "PowerDistributionPanel 1", pdpMonitorPowerDistributionPanel1);
        
        intakeTalonSRX1 = new WPI_TalonSRX(1);
        
        
        shooterTalonSRX1 = new WPI_TalonSRX(2);
        
        navX = new AHRS(SPI.Port.kMXP);
        
        

    }
}
