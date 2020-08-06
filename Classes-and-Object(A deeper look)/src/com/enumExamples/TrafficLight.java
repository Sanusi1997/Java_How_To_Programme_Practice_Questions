package com.enumExamples;

public enum TrafficLight {

	RED(30), GREEN(20), YELLOW(40);

	private int seconds;

	TrafficLight(int seconds) {
		this.seconds = seconds;

	}

	public int getSeconds() {
		return seconds;
	}

}
