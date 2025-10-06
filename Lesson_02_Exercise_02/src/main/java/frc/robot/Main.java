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
    
    /*
     * a while loop is a bit like an if statement in that the code inside only
     * runs if the condition in the () is true. However, the difference is that
     * it runs the code on repeat until that condition isn't true. On each repeat,
     * it checks again, and stops once it gets a false.
     * To use a while loop, the variable that will terminate the loop must be defined
     * outside the loop. 
     */
    int count = 0;
    while (count < 5) {
      writeMessage("looping iteration " + count);
      count++;
    }
  }
  
  // This is the definition for writeMessage, which defines what writeMethod does. 
  // As you can see, it is secretly just a different line of code in a nice wrapper.
  // Later, you'll be writing your own.
  private static void writeMessage(String msg) {
    System.out.println(msg);
  }
}
