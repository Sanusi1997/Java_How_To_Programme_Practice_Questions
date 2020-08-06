package com.shapes;

public class Square extends TwoDimensionalShape {
    private double length;
    public Square(double length) {
        if (length <= 0.0) {
            throw new IllegalArgumentException("Length cannot be less than or equal to zero");
        }
        this.length = length;
    }

    public void setLength(double length) {
        if (length <= 0.0) {
            throw new IllegalArgumentException("length cannot be less than or equal to zero");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }
    @Override
    public String toString(){
        return String.format("%s: %.2fcm%n", "Length of Square", getLength());
    }
}
