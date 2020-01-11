
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.driveManual;


public class driveTrain extends SubsystemBase {
  
  //Creates Motor Classes
  WPI_TalonSRX leftMaster = new WPI_TalonSRX(Constants.LEFT_DRIVE_MOTOR1);
  WPI_TalonSRX leftSlave = new WPI_TalonSRX(Constants.LEFT_DRIVE_MOTOR2);
  WPI_TalonSRX rightMaster = new WPI_TalonSRX(Constants.RIGHT_DRIVE_MOTOR1);
  WPI_TalonSRX rightSlave = new WPI_TalonSRX(Constants.RIGHT_DRIVE_MOTOR2);

  //Creates Differential Drive
  final DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster);

  public driveTrain() {

    //Motors follow their corresponding Master motor
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightMaster);

  }

  public void manualDrive(double move, double turn){

    if(move > Constants.MAX_MOVE_SPEED) move = Constants.MAX_MOVE_SPEED;
    if(move < Constants.MIN_MOVE_SPEED) move = Constants.MIN_MOVE_SPEED;
    if(turn > Constants.MAX_MOVE_SPEED) turn = Constants.MAX_MOVE_SPEED;
    if(turn < Constants.MIN_MOVE_SPEED) turn = Constants.MIN_MOVE_SPEED;

    drive.arcadeDrive(move, turn);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    setDefaultCommand(new driveManual(RobotContainer.m_driveTrain));

  }

}
