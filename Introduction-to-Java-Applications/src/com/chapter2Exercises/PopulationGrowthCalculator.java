package com.chapter2Exercises;

import java.util.Scanner;


public class PopulationGrowthCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		 double currentPopulation = 7900000000.0;
		 double annualGrowthRate = 1.01;
		 int currentYear = 2020;
		 
		 System.out.println("Enter year of Population interest after 2020: ");
		 int yearGiven = input.nextInt();
		 
		 int numberOfYears = yearGiven - currentYear;
		 
		 double popAfterGivenYear = currentPopulation  * Math.pow(annualGrowthRate, numberOfYears);
		 
		 System.out.printf("The population in %d is : %.2f", yearGiven, popAfterGivenYear);
		
	}

}
