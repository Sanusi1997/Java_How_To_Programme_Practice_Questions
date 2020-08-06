package com.chapter2Exercises;

import java.util.Scanner;

public class CircleProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter radius of Circle: ");
		float radius = collect.nextInt();
		
		System.out.printf("The diameter of the circle is: %.2f%n"
				+ "The Circumference of the circle is: %.2f%n"
				+ "The Area of the circle is: %.2f", (2*radius), (2 * Math.PI * radius),
				(Math.PI * radius *radius));
	}

}
