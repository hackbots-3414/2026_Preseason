// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/**
 * Represents the data and methods on a Circle. Note that this is quite
 * a bit different from a Rectangle, yet is still a Shape.
 */
public class Circle implements Shape {

    // Most classes hold data. By convention, we record those at the beginning of
    // the file, just after class declaration (public class...) to make them easy to
    // find. These are special variables, accessible from everywhere within the
    // class.

    /**
     * Double-precision (64-bit) floating-point value of the circle's radius
     * 
     * Defaults to zero as this is usually safe.
     */
    private double radius = 0;

    // After the fields come the methods. These are things you can do with the
    // class's data.
    //
    // By convention, we list the constructors first, as they define how a program
    // can create instances of the class - they're the beginning of the life of an
    // instance and so come first.

    /**
     * Default (no arguments) constructor. Probably not the one most people will
     * want, but handy.
     */
    public Circle() {
        // While we do default the radius to zero, we can also call our constructor that
        // takes
        // the radius as a parameter via the "this" keyword.
        this(0);
    }

    /**
     * This is the constructor (or c'tor) we expect to be used the most. It takes
     * the radius as a parameter.
     * 
     * @param radius
     */
    public Circle(double radius) {
        // our field and our constructor's parameter are spelled the same. This is good
        // for readability,
        // but it does mean want to disambiguate the field from the paramter. The "this"
        // keyword comes
        // to our rescue again, indicating the field. The parameter without "this" is
        // the parameter.
        this.radius = radius;
    }

    /**
     * Java conventions would have us supply getters and setters for our property
     * fields when it makes
     * sense to do so.
     * 
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Java conventions would have us supply getters and setters for our property
     * fields when it makes
     * sense to do so.
     * 
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Because we implement Shape, we must supply area() and perimeter() methods.
     * These look quite different from Rectangle because Circle is quite different,
     * yet, both are Shapes and clients need not care how the methods were
     * implemented.
     * 
     * The Override annotation tells the compiler to alert us if Shape changes the
     * signature (spelling, parameter list, and return type) or removes the method
     * we thought we were supplying.
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Implement the perimeter() method demanded by the Shape interface.
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
