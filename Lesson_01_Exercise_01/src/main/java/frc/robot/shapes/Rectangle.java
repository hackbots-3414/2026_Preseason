// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/** Holds the data and methods needed for a Rectangle. */
public class Rectangle implements Shape {

    // Most classes hold data.  By convention, we record those at the beginning of the file, just after
    // class declaration (public class...) to make them easy to find.  These are special variables,
    // accessible from everywhere within the class.

    /** 
     * Double-precision floating point decimal holding the x length of the rectangle, private so
     * it is only visible within this instance of this class.
     * 
     * Defaults to zero as that is usually safe.
     */
    private double width = 0;

    /**
     * Double-precision floating point decimal holding the y length of the rectangle, private so
     * it is only visible within this instance of this class.
     * 
     * Defaults to zero as that is usually safe.
     */
    private double height = 0;

    // After the fields come the methods.  These are things you can do with the class's data.
    // By convention, we list the constructors first, as they define how a program can create
    // instances of the class - they're the beginning of the life of an instance and so come first.

    /**
     * Default constructor - method with same name as the class taking no parameters.
     */
    public Rectangle() {
        // The constructor we kind of want everyone to use takes 2 doubles as parameters.
        // For convenience, this constructor can call the one with want with smart default
        // values - in this case zeros.
        // 
        // The "this" keyword refers to the current instance of the class, so this() is a
        // constructor call.
        this(0, 0);
    }

    /**
     * Preferred constructor (or c'tor) for creating a Rectangle.  I alphabetized the parameter
     * names, but didn't have to.  A good method lists parameters in the most readable way.  Leftmost
     * might be most important, biggest, or maybe first in a process (e.g. copy(source, destination) because
     * we copy from source to destination).
     * @param height
     * @param width
     */
    public Rectangle(double height, double width) {
        // our parameters are spelled the same as our fields, which is great for readability, but could
        // be ambiguous - if we say height, do we mean parameter height or field height?
        // We disambiguate via the "this" keyword.  The field is this.height, the parameter is then 
        // just height all by itself.
        this.height = height;
        this.width = width;
    }

    // Java convention says we should supply getters and setters for our "property" fields.

    /**
     * 
     * @return the rectangle's width
     */
    public double getWidth() {
        return width;
    }

    /**
     * set the rectangle's width
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * get the rectangle's height
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * set the rectangle's height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the area of the rectangle.  Note that we must supply this method because
     * we implement the interface Shape.  The Override annotation helps us remember we
     * created this method because a parent class or implemented interface told us to.
     * If the interface or parent changes the method signature (renames it, 
     * changes the parameter types, changes the return type) or removes the method, 
     * this Override annotation will cause compilation to fail, reminding us to update this class.
     */
    @Override
    public double area() {
        return  width * height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }
    
}
