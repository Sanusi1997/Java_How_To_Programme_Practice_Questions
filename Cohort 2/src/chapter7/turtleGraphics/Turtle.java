package chapter7.turtleGraphics;
import java.math.BigInteger;
import java.util.logging.Logger;

import chapter7.turtleGraphics.exception.*;

public class Turtle {//implements Comparable <Turtle> 
	private Logger logger = Logger.getLogger(Turtle.class.getName());
	
	private Pen turtlePen;
	private Orientation turtleOrientation = Orientation.COLUMN_RIGHT;
	private int columnCoordinate;
	private int rowCoordinate;
						
	public Pen getTurtlePen() {
		return turtlePen;
	}

	
	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}

	
	public Orientation getTurtleOrientation() {
		return turtleOrientation;
	}

	public void setTurtleOrientation(Orientation turtleDirection) {
		this.turtleOrientation = turtleDirection;
	}


	public int getColumnCoordinate() {
		return columnCoordinate;
	}


	public void setColumnCoordinate(int columnCoordinate) {
		this.columnCoordinate = columnCoordinate;
	}

	
	public int getRowCoordinate() {
		return rowCoordinate;
	}

	public void setRowCoordinate(int rowCoordinate) {
		this.rowCoordinate = rowCoordinate;
	}

	public void draw(int numberOfSteps, SketchPad drawingPad) throws TurtleException {
		boolean drawingPadValidated = TurtleValidator.isValidSketchPad(drawingPad);
		if(!drawingPadValidated) {
			String errorMessage = "Sketchpad for the turtle to draw on cannot be null";
			logger.severe(errorMessage);
			throw new TurtleException(errorMessage);
		}
		
		int floorBoundary = drawingPad.getFloor().length;
		int currentCoordinate = this.columnCoordinate;
		if(this.turtleOrientation == Orientation.ROW_LEFT || this.turtleOrientation == Orientation.ROW_RIGHT) {
			currentCoordinate = this.rowCoordinate;
		}
		
		boolean numberOfStepsValidated = TurtleValidator.isValidNumberOfSteps(numberOfSteps, floorBoundary, currentCoordinate, this.turtleOrientation);
		if(!numberOfStepsValidated) {
			String errorMessage = "Method draw was called with inv  alid number of steps " + numberOfSteps;
			logger.info(errorMessage);
			throw new TurtleException(errorMessage);
		}
		
		for(int i = 0; i < numberOfSteps; i++) {
			drawingPad.getFloor()[this.rowCoordinate][this.columnCoordinate] = 1;
			if(this.turtleOrientation == Orientation.COLUMN_RIGHT && i != numberOfSteps-1) {
				this.columnCoordinate++;
			} else if(this.turtleOrientation == Orientation.ROW_RIGHT && i != numberOfSteps-1){
				this.rowCoordinate++;
			} else if(this.turtleOrientation == Orientation.COLUMN_LEFT && i != numberOfSteps-1){
				this.columnCoordinate--;
			} else if(this.turtleOrientation == Orientation.ROW_LEFT && i != numberOfSteps-1){
				this.rowCoordinate--;
			}
		}
	}
	
//		@Override
//		public int compareTo(Turtle anotherTurtle) {
//			int result = -1;
//			
//			int xCoordinateResult = BigInteger.ZERO.intValue();
//			int yCoordinateResult = 5;
//			
//			if(this.columnCoordinate > anotherTurtle.columnCoordinate)
//				
//		}
}
