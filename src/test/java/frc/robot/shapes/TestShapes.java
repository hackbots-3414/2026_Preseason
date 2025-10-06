// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.shapes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a program that ensures our Shapes are behaving.
 * 
 * It is good to understand the TestCircle and TestRectangle unit tests before
 * tackling this one. TestShapes assumes the TestCircle and TestRectangle have
 * validated the math inside Circle, Rectangle, and Square.
 * 
 * This test plays some games setting up a random sequence of Shape
 * implementations with randomized sizes. It intends to show that no matter the
 * implementation, so long as the class implements Shape, the class can be used.
 * 
 */
public class TestShapes {
    // declare a logger for debugging, common practice is to make it static so it is
    // clear that it is shared across all instances of TestShapes. THe final keyword
    // prevents it from being reassigned once initialized. Static and final fields
    // can be thought of as constants, and so the variable is spelled in all-caps.
    private static final Logger LOG = LoggerFactory.getLogger(TestShapes.class);
    private static final int MIN_NUMBER_SHAPES = 9;
    private static final int MAX_NUMBER_SHAPES = 99;
    private Shape[] shapes = null;

    /**
     * It can be handy to have a way to set up some state prior to running a test
     * method.
     * The @BeforeEach annotation will flag a method to be run to set things up.
     */
    @BeforeEach
    public void setup() {
        int randomSize = ThreadLocalRandom.current().nextInt(MIN_NUMBER_SHAPES, MAX_NUMBER_SHAPES);
        shapes = new Shape[randomSize];
        LOG.debug("Creating {} shapes", randomSize);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = createShape(ThreadLocalRandom.current().nextInt(0, 3));
        }
    }

    /**
     * This private method injects some randomness into our test.
     * 
     * @param type
     * @return a randomly selected Shape
     */
    private Shape createShape(int type) {
        Shape result = null;
        double sizeOne = ThreadLocalRandom.current().nextDouble(0.0, 100.0);
        double sizeTwo = ThreadLocalRandom.current().nextDouble(0.0, 100.0);

        // a Java switch statement is an elegant way to write if/then/else. Note that
        // the "break"
        // keyword is critical to separate the case statements - if case 0 didn't break
        // and type == 0,
        // case 0 will run, then case 1, and case 1's break would skip the default
        switch (type) {
            case 0:
                result = new Rectangle(sizeOne, sizeTwo);
                break;
            case 1:
                result = new Square(sizeOne);
                break;
            default:
                result = new Circle(sizeOne);
        }
        return result;
    }

    /**
     * To showcase a means of cleaning up after a test, the @AfterEach annotation can
     * be used to flag a method to run after executing each test.
     */
    @AfterEach
    public void tearDown() {
        shapes = null;
    }

    /**
     * The goal of this test is to prove we can have many implementations of Shape
     * and always
     * call the area() and perimeter() methods without knowing what implementation
     * is.
     * 
     * Actually testing the area and perimeter math could be done here, but as we
     * have test classes
     * for the shapes, there is no need to duplicate the logic.
     */
    @Test
    public void testShapes() {
        double area = 0.0;
        double perimeter = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            area = shapes[i].area();
            perimeter = shapes[i].perimeter();
            LOG.trace("{}: area = {}, perimeter = {}", shapes[i], area, perimeter);
            assertTrue(area >= 0, "Area of " + shapes[i] + "should be greater than or equal to zero");
            assertTrue(perimeter >= 0, "Perimeter of " + shapes[i] + "should be greater than or equal to zero");
        }
    }

}
