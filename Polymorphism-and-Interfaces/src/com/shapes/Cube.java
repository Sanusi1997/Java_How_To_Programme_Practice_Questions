package com.shapes;

public class Cube  extends ThreeDimensionalShape{
    private double length;
    private static final double CUBE_FACTOR = 6;
    public Cube(double length) {
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
        return Math.pow(getLength(), 2) * CUBE_FACTOR;
    }

    @Override
    public double getVolume() {
        return Math.pow(getLength(), 3);
    }
    @Override
    public String toString(){
        return String.format("%s: %.2fcm%n", "Length of Cube", getLength());
    }
}
