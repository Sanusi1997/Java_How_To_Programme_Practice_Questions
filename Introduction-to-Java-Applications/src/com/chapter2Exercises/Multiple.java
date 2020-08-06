package com.chapter2Exercises;

import  java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.println("Please enter first integer: ");
		number1 = input.nextInt();
		
		System.out.println("Please enter second integer: ");
		number2= input.nextInt();
		
		if (number1 % number2 == 0)
			System.out.printf("%d is a multiple of %d%n", number1, number2);
		else
			System.out.printf("%d is not a multiple of %d%n", number1, number2);
		

	}

}
