package chapter7.turtleGraphics;

import java.math.BigInteger;

public class TurtleValidator {
	
	public static boolean isValidNumberOfSteps(int numberOfSteps, int boundary, int currentCoordinate, Orientation direction) {
		boolean result = false;
		
		if(direction == Orientation.COLUMN_RIGHT) {
			result = isValidNumberofStepsColumnRight(numberOfSteps, boundary, currentCoordinate, direction);
		} else if(direction == Orientation.ROW_RIGHT){
			result = isValidNumberofStepsRowRight(numberOfSteps, boundary, currentCoordinate, direction);
		} else if(direction == Orientation.COLUMN_LEFT){
			result = isValidNumberofStepsColumnLeft(numberOfSteps, boundary, currentCoordinate, direction);
		} else if(direction == Orientation.ROW_LEFT){
			result = isValidNumberofStepsRowLeft(numberOfSteps, boundary, currentCoordinate, direction);
		}
		
		return result;
	}

	public static boolean isValidNumberOfSteps(int numberOfSteps, int boundary) {
		boolean result = false;
		if(numberOfSteps > BigInteger.ZERO.intValue() && numberOfSteps < boundary) {
			result = true;
		}
		return result;
	}
	
	public static boolean isValidSketchPad(SketchPad thePad) {
		boolean result = true;
		if(thePad == null || thePad.getFloor() == null) {
			result = false;
		}
		return result;
	}
	
	public static boolean isValidNumberofStepsColumnRight(int numberOfSteps, int boundary, int coordinate, Orientation direction) {
		//check if number of steps make sense regardless of current position
		boolean result = isValidNumberOfSteps(numberOfSteps, boundary);
		
		//now check if number of steps makes sense based on current position
		int targetColumnRightLocation = coordinate + numberOfSteps;
		
		if(!result || ((direction == Orientation.COLUMN_RIGHT) && (targetColumnRightLocation > boundary) ) ) {
			result = false;
		}
		return result;
	}
	
	public static boolean isValidNumberofStepsColumnLeft(int numberOfSteps, int boundary, int coordinate, Orientation direction) {
		boolean result = isValidNumberOfSteps(numberOfSteps, boundary);
		int targetColumnLeftLocation = coordinate - numberOfSteps;
		
		if(!result || ((direction == Orientation.COLUMN_LEFT) && (targetColumnLeftLocation < BigInteger.ZERO.intValue()) ) ) {
			result = false;
		}
		return result;
	}
	
	public static boolean isValidNumberofStepsRowRight(int numberOfSteps, int boundary, int coordinate, Orientation direction) {
		boolean result = isValidNumberOfSteps(numberOfSteps, boundary);
		int targetRowRightLocation = coordinate + numberOfSteps;
		
		if(!result || ((direction == Orientation.ROW_RIGHT) && (targetRowRightLocation > boundary) ) ) {
			result = false;
		}
		return result;
	}
	
	public static boolean isValidNumberofStepsRowLeft(int numberOfSteps, int boundary, int coordinate, Orientation direction) {
		boolean result = isValidNumberOfSteps(numberOfSteps, boundary);
		int targetRowLeftLocation = coordinate - numberOfSteps;
		
		if(!result || ((direction == Orientation.ROW_LEFT) && (targetRowLeftLocation < BigInteger.ZERO.intValue()) ) ) {
			result = false;
		}
		return result;
	}
}
