// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Test program to ensure our Rectangle's methods do the right thing */
public class TestRectangle {
    /**
     * An automated unit test supplies methods tagged with the @Test annotation.
     * Ideally, every method in the class being tested has at least one
     * corresponding test* method.
     * 
     * Several test* methods may be necessary to cover every branch
     * (e.g. if/else if/then... should have 3 test* methods)
     * 
     * Test the area() math
     */
    @Test
    public void testArea() {
        // "basic", or "expected" case - 2 numbers multiplied together
        Rectangle r = new Rectangle(2.0, 4.0);
        // assertEquals is one of the methods JUnit supplies to check 2 values.
        // It is good practice to include a message as the last parameter so if 
        // the assert fails and the test fails, you have a hint as to why
        assertEquals(8.0, r.area(), "Expected and reported area should match");

        // Zero is an interesting edge case, so worth testing by itself
        // Note that some programmers will put this test in its own testAreaWithZero()
        // method
        r = new Rectangle(0.0, 150.0);
        assertEquals(0.0, r.area(), "Zero area test");
    }

    /**
     * Test the perimeter math.
     */
    @Test
    public void testPerimeter() {
        Rectangle r = new Rectangle(4.0, 2.0);
        assertEquals(12.0, r.perimeter(), "Expected and reported perimeter should match");
    }
}
