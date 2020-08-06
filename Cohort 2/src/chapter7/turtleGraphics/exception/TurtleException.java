package chapter7.turtleGraphics.exception;

public class TurtleException extends Exception {
	
	public TurtleException(String message) {		
		super(message);
		}
	public TurtleException(String message, Exception Cause) {		
		super(message, Cause);	
		}
}


