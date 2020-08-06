package com.rectangle;

import java.math.BigInteger;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle() {
		this(BigInteger.ONE.doubleValue(), BigInteger.ONE.doubleValue());
	}

	public Rectangle(double length, double width) {
		if (width < 0.0 || width > 2.0) {
			throw new IllegalArgumentException("Width should not be less than o or greater than 2");
		}
		if (length < 0.0 || length > 2.0) {
			throw new IllegalArgumentException("Length should not be less than o or greater than 2");
		}

		this.length = length;
		this.width = width;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length < 0.0 || length > 2.0) {
			throw new IllegalArgumentException("Length should not be less than o or greater than 2");
		}

		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0.0 || width > 2.0) {
			throw new IllegalArgumentException("Width should not be less than o or greater than 2");
		}
		this.width = width;
	}

	public String toString() {

		return String.format("%nLength of Rectangle: %.2f%nWidth of Rectanlge: %.2f", length, width);

	}


}
