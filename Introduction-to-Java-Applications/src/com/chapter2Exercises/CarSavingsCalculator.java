package com.chapter2Exercises;
import java.util.Scanner;

public class CarSavingsCalculator {
	
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total miles driven per day: ");
		double totalMilesPerDay = input.nextDouble();
		
		System.out.println("Enter cost per gallon of gasoline: " );
		double costPerGallon =   input.nextDouble();
		
		System.out.println("Enter average miles per gallon: " );
		double averageMilesPerGallon = input.nextDouble();
		
		System.out.println("Enter parking fees for the day: " );
		double parkingFees = input.nextDouble();
		
		System.out.println("Enter tolls per day: " );
		double tollsPerDay = input.nextDouble();
		
		double gallonUsedDaily = totalMilesPerDay / averageMilesPerGallon;
		
		double dailyDrivingCosts = (gallonUsedDaily * costPerGallon) + parkingFees + tollsPerDay;
		
		
		System.out.printf("Your daily driving costs is : $%.2f", dailyDrivingCosts);
	}

}
