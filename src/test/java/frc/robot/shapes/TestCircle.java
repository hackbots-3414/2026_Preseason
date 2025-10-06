// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Test program for the Circle shape */
public class TestCircle {
    /**
     * An automated unit test supplies methods tagged with the @Test annotation.
     * Ideally, every method in the class being tested has at least one
     * corresponding test* method.
     * 
     * Several test* methods may be necessary to cover every branch
     * (e.g. if/else if/then... should have 3 test* methods)
     * 
     * Check the unit circle, since it is easy, and if wrong, simpler to debug
     */
    @Test
    public void testAreaUnitCircle() {
        Circle c = new Circle(1.0);
        assertEquals(Math.PI, c.area(), "Area of unit circle is Pi");
    }

    /**
     * Check the unit circle, since it is easy
     */
    @Test
    public void testPerimeterUnitCircle() {
        Circle c = new Circle(1.0);
        assertEquals(2 * Math.PI, c.perimeter(), "Perimeter of unit circle is 2*Pi");
    }

    /**
     * The unit circle is a nice case, but most circles are not the unit circle,
     * so make sure we test something else too.
     */
    @Test
    public void testNonUnitCircle() {
        Circle c = new Circle(3.0);
        assertEquals(6 * Math.PI, c.perimeter(), "Perimeter check");
        assertEquals(9 * Math.PI, c.area(), "Area check");
    }
}
