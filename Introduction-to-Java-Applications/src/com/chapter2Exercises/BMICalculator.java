package com.chapter2Exercises;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println( "heightInMetres : ");
		int heightInMetres = input.nextInt();

		System.out.println( "weightInKilogram : ");
		int weightInKilograms = input.nextInt();
	

		double bmiIndex = weightInKilograms / (heightInMetres * heightInMetres) ;

		System.out.printf("BMI is  %.2f%n",  bmiIndex);
	
	    double a = 18.5;
		double b = 24.9;
		double c = 25.0;
		double d = 29.9;
		double e = 30.0; 

		if( bmiIndex < a){
		System.out.println("Patient is Underweight");
		}

		if(  a >= bmiIndex && bmiIndex <= b){
		System.out.println("Patient is Normal");
		}

		if( c >= bmiIndex && bmiIndex <= d){
		System.out.println("Patient is Overweight");
		}

		if( bmiIndex >= e){
		System.out.println("Patient is Obese" );
		} 

	}

}
