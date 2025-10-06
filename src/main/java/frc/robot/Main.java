// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import frc.robot.shapes.Circle;

import java.util.Random;

/**
 * This is our Main class. 
 */
public final class Main {
  private static Logger LOG = LoggerFactory.getLogger(Main.class);
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
    writeMessage("starting!");

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


    /* 
     * EXERCISE 2: If-Else
     * if () statements allow you choose what code to run based upon a boolean expression 
     * (boolean expression = something that evaluates to true or false) 
     */
    Random rand = new Random(); //these two lines fill x with a random number for you
    int x = rand.nextInt(5);

    if (x > 2) { 
      writeMessage("greater than 2! number is " + x);
    } else {
      writeMessage("less than or equal to 2! number is " + x);
    }


    /* 
     * EXERCISE 3: Loops
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

    // for is one of the most common loops.  Within the (),
    // it defines a variable (int i, initially set to 0); 
    // a condition to test that will terminate the loop when false (i < 10);
    // a statement to run that usually modifies the variable (i++)
    writeMessage("current count is " + count);
    for (int i = 0; i < 10; i++) {
      count = count + 5;
    }
    writeMessage("final count after loop is " + count);

    // do-while is less common but guarantees the loop will always execute once as the condition for
    // termination is evaluated at the end of the loop.
    do {
      count = count / 10;
      writeMessage("do-while count: " + count);
    } while (count > 0);

    /* 
     * EXERCISE 4: Using methods
     * objective: output the radius of this 8 unit circle using a method
     * hint: if a method takes in a String, you will need to convert your value to a String before
     * passing it into the method. since the radius is a double (number with a decimal point), you
     * can convert it to a string using either "" + radius (this "concatenates" the value to an
     * empty string "", but you can also put something like "radius is: " and it will achieve the 
     * same), or String.valueOf(radius) which converts directly to a String. 
     */
    double circ = 8.0;
    double radius = calculateRadiusFromCirc(circ);

    // EXERCISE ??: Logging
    writeLogMessages();

    /**
     *  EXERCISE 7: Using classes
     * this line creates a circle using a "constructor". the circle acts like variables we've
     * seen before; it lives inside "c" and can have its methods called with the . operator.
     */
    Circle c = new Circle(3.0);
    // here we call the method setRadius on our circle, which, as you can guess, sets the radius
    // to 3.414.
    c.setRadius(3.414);
    // now, use writeMessage() and the circle's area() method to output the area of the circle.

    // EXERCISE 8: Creating a class
    // declare your Car here!

  }

  /**
   * This is method to write a bunch of Hello Worlds to the console.  By playing with the 
   * src/main/resources/logback.xml, you can control how much of the messages display - important
   * when you have lots of loops or one loop that may spit a message every 20ms (50 / second).
   */
  private static void writeLogMessages() {
    System.out.println("Hello World!");
    System.err.println("Hello World!!");
    LOG.error("writeLogMessages(): Hello World error");
    LOG.warn("writeLogMessages(): Hello World warning");
    LOG.info("writeLogMessages(): Hello World info");
    LOG.debug("writeLogMessages(): Hello World debug");
    LOG.trace("writeLogMessages(): Hello World trace");
  }

  // This method accepts a circumference and returns the radius based on that circumference.
  // Hmm... what was the formula for circumference again? This might not be right...
  // EXERCISE 5: edit the body of this method to correct its output
  private static double calculateRadiusFromCirc(double circumference) {
    double radius = circumference / 2.0;
    return radius;
  }

  // This is the definition for writeMessage, which defines what writeMethod does. 
  // As you can see, it is secretly just a different line of code in a nice wrapper.
  // Later, you'll be writing your own.
  private static void writeMessage(String msg) {
    System.out.println(msg);
  }

  // EXERCISE 6: Write your own method!
  // put the code for your new method beneath this comment. feel free to copy and paste
  // another method from above and then edit it to do what you'd like it to.

}
