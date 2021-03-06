/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

//Drive Motors
public static final int LEFT_DRIVE_MOTOR1 = 0;
public static final int LEFT_DRIVE_MOTOR2 = 1;
public static final int RIGHT_DRIVE_MOTOR1 = 2;
public static final int RIGHT_DRIVE_MOTOR2 = 3;

//Joysticks
public static final int DRIVE_CONTROLLER = 0;

//Buttons --> Axis
public static final int LEFT_STICK_Y = 1;
public static final int LEFT_STICK_X = 0;

//Motor Speeds
public static final double MAX_MOVE_SPEED = 0.75;
public static final double MIN_MOVE_SPEED = -0.75;

}
