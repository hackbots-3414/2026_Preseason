// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * This is our Main class. 
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   * 
   * Learn_Java: for a Java program to be executed, it _must_ have a class
   * with a public static void main(String[] arguments) method.  For WPILib
   * robot programs, the class is usally also named "Main", and that is 
   * helpful.  Java does not care though.  You can run this class from 
   * the command line by typing:
   *   java frc.robot.Main
   * and the robot will start. If you wish to rename the class, or use
   * a package other than frc.robot, you will need to update build.gradle
   * (look for ROBOT_MAIN_CLASS).   
   */
  public static void main(String... args) {
    // RobotBase.startRobot(Robot::new); -- commenting as we don't actually want to start a Robot program
    
    // for is one of the most common loops.  Within the (),
    // it defines a variable (int i, initially set to 0); 
    // a condition to test that will terminate the loop when false (i < 10);
    // a statement to run that usually modifies the variable (i++)
    writeMessage("current count is " + count);
    for (int i = 0; i < 10; i++) {
      count = count + 5;
    }
    writeMessage("final count after loop is " + count);
  }
  
  // This is the definition for writeMessage, which defines what writeMethod does. 
  // As you can see, it is secretly just a different line of code in a nice wrapper.
  // Later, you'll be writing your own.
  private static void writeMessage(String msg) {
    System.out.println(msg);
  }
}
