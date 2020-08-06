package com.complexNumbers;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	private final String iValue = "i";

	public Complex() {
	}

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	public void addComplexNumber(double realPart, double imaginaryPart) {

		double sumOfRealPart = (getRealPart() + realPart);
		double sumOfImaginaryPart = (getImaginaryPart() + imaginaryPart);

		System.out.printf("(%.0f, %.0fi)%n", sumOfRealPart, sumOfImaginaryPart);

	}

	public void subtractComplexNumber(double realPart, double imaginaryPart) {

		double differenceOfRealPart = (getRealPart() - realPart);
		double differenceOfImaginaryPart = (getImaginaryPart() - imaginaryPart);

		System.out.printf("(%.0f, %.0fi)%n", differenceOfRealPart, differenceOfImaginaryPart);

	}
	
}