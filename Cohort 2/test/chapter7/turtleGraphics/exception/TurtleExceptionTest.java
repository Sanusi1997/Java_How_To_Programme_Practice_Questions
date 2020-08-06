package chapter7.turtleGraphics.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleExceptionTest {
	TurtleException problem;
	TurtleException aProblem;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void turtleExceptionExistsTest() {
	
		problem  = new TurtleException("Turtle has a problem");
		assertNotNull(problem);
	}
	void turtleExceptionDoubleConstructorArgumentTest() {
		Exception rootCause = new Exception();
		aProblem = new TurtleException("Turtle has a problem",rootCause);
	     assertNotNull(aProblem);
	}

}
