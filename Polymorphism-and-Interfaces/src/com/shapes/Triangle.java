package com.shapes;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base <= 0.0) {
            throw new IllegalArgumentException("Base cannot be less than or equal to zero");
        }
        if (height <= 0.0) {
            throw new IllegalArgumentException("Height cannot be less than or equal to zero");
        }
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        if (base <= 0.0) {
            throw new IllegalArgumentException("Base cannot be less than or equal to zero");
        }
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double Height) {
        if (Height <= 0.0) {
            throw new IllegalArgumentException("Height cannot be less than or equal to zero");
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * getBase() * getHeight();
    }

    @Override
    public String toString() {
        return String.format("%s: %.2fcm%n%s: %.2fcm%n", "Breadth of Triangle", getBase(),
                "Height of Triangle", getHeight());
    }
}
