package com.enumExamples;

import java.util.EnumSet;

public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.printf("%-13s%28s%n", "Traffic Color", "Display Seconds");
		
		for(TrafficLight light:  TrafficLight.values())
			System.out.printf("%-13s%18ss%n", light, light.getSeconds());

	}

}
