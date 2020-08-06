package com.shapes;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius cannot be less than or equal to zero");
        }
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius cannot be less than or equal to zero");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
    @Override
    public String toString(){
        return String.format("%s: %.2fcm%n", "Radius of Circle", getRadius());
    }
}

