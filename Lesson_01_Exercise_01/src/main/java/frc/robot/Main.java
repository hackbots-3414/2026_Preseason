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
    writeMessage("Program starting!");

    // EXERCISE 1: main
    // here are some examples of things you can do with code!

    // this line creates a variable called "numDogs" and sets it to 0
    int numDogs = 0;
    // this line creates a boolean variable (can only be true or false)
    boolean wantMore = true;
    String awesomeName = "Barker";

    // both of these lines add 1 to our total of dogs, resulting in 2 more
    numDogs = numDogs + 1;
    numDogs++;

    // oops! I didn't think of enough names for 2 dogs, so let's divide that 
    // number by 2 so we only get one. 
    numDogs = numDogs / 2;

    // hmm... now that I'm thinking about it, I don't like the name Barker.
    // Let's change the value of awesomeName to something better.
    awesomeName = "Byter";

    // this line uses a "method" called writeMessage to print what is in the (). 
    // we will explore that more later!
    writeMessage("We will adopt " + numDogs + " dog(s) named " + awesomeName);
  }
  
  // This is the definition for writeMessage, which defines what writeMethod does. 
  // As you can see, it is secretly just a different line of code in a nice wrapper.
  // Later, you'll be writing your own.
  private static void writeMessage(String msg) {
    System.out.println(msg);
  }
}
