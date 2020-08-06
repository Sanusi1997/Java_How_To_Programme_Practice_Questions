package chapter7.turtleGraphics;

import chapter7.turtleGraphics.exception.TurtleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
	private Turtle myTurtle;
	private Pen biro;
	private SketchPad aPad;
	private SketchPad bPad;

	@BeforeEach
	void setUp() throws Exception {
		myTurtle = new Turtle();
		biro = new Pen();
		aPad = new SketchPad();
		myTurtle.setTurtlePen(biro);

	}

	@Test
	void turtleExistsTest() {
		try {
			assertNotNull(myTurtle);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	void penNotNullTest() {
		assertNotNull(biro);
	}

	@Test
	void turtlePenNotNull() {
		myTurtle.setTurtlePen(biro);
		assertNotNull(myTurtle.getTurtlePen());
	}

	@Test
	void turtlePenPositionIsUp() {
		myTurtle.setTurtlePen(biro);
		assertNotNull(myTurtle.getTurtlePen().getPenPosition());
		assertEquals(Position.UP, myTurtle.getTurtlePen().getPenPosition());
	}

	@Test
	void turtleHasDirection() {
		assertNotNull(myTurtle.getTurtleOrientation());
	}

	@Test
	void turtleDirectionByDefaultIsRight() {
		assertNotNull(myTurtle.getTurtleOrientation());
		assertEquals(Orientation.COLUMN_RIGHT, myTurtle.getTurtleOrientation());
	}

	@Test
	void turtleDefaultCoordinatesAreZero() {
		assertNotNull(myTurtle);
		assertEquals(0, myTurtle.getColumnCoordinate());
		assertEquals(0, myTurtle.getRowCoordinate());
	}

	@Test
	void sketchpadExists() {
		assertNotNull(aPad);
	}

	@Test
	void sketchPadHasAFloor() {
		assertNotNull(aPad.getFloor());
	}

	@Test
	void changeTurtleDirection() {
		assertEquals(Orientation.COLUMN_RIGHT, myTurtle.getTurtleOrientation());
		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		assertEquals(Orientation.ROW_RIGHT, myTurtle.getTurtleOrientation());
	}

	@Test
	void changePenPosition() {
		assertEquals(Position.UP, biro.getPenPosition());
		biro.setPenPosition(Position.DOWN);
		assertEquals(Position.DOWN, biro.getPenPosition());
	}

	@Test
	void drawMovingForwardOnSketchPad() {
		try {
			myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
			myTurtle.draw(12, aPad);
			assertEquals(0, myTurtle.getRowCoordinate());
			assertEquals(11, myTurtle.getColumnCoordinate());
		} catch (TurtleException ex) {
			ex.printStackTrace();
		}
		for (int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}
	}

	@Test
	void drawMovingForwardAndTurnRightOnSketchPad() {
		try {
			myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
			myTurtle.draw(12, aPad);
			assertEquals(0, myTurtle.getRowCoordinate());
			assertEquals(11, myTurtle.getColumnCoordinate());
			myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
			myTurtle.draw(12, aPad);
		}
		catch (TurtleException e) {
			e.printStackTrace();

		}
			assertEquals(11, myTurtle.getRowCoordinate());
			assertEquals(11, myTurtle.getColumnCoordinate());
			for (int i = 0; i < 12; i++) {
				assertEquals(1, aPad.getFloor()[0][i]);
			}

			for (int i = 0; i < 12; i++) {
				assertEquals(0, aPad.getFloor()[i][11]);
			}
		 


	}

	@Test
	void drawAndDisplaySketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		try {
			myTurtle.draw(12, aPad);
			assertEquals(0, myTurtle.getRowCoordinate());
			assertEquals(11, myTurtle.getColumnCoordinate());
			for (int i = 0; i < 12; i++) {
				assertEquals(1, aPad.getFloor()[0][i]);
			}

			myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
			myTurtle.draw(12, aPad);
			assertEquals(11, myTurtle.getRowCoordinate());
			assertEquals(11, myTurtle.getColumnCoordinate());
			for (int i = 0; i < 12; i++) {
				assertEquals(1, aPad.getFloor()[i][11]);
			}

			myTurtle.setTurtleOrientation(Orientation.COLUMN_LEFT);
			myTurtle.draw(12, aPad);
			assertEquals(11, myTurtle.getRowCoordinate());
			assertEquals(0, myTurtle.getColumnCoordinate());
			for (int i = 0; i < 12; i++) {
				assertEquals(1, aPad.getFloor()[11][i]);
			}

			myTurtle.setTurtleOrientation(Orientation.ROW_LEFT);
			myTurtle.draw(12, aPad);
			assertEquals(0, myTurtle.getRowCoordinate());
			assertEquals(0, myTurtle.getColumnCoordinate());
			for (int i = 0; i < 12; i++) {
				assertEquals(1, aPad.getFloor()[i][0]);
			}
		} catch (TurtleException ex) {
			ex.getMessage();
		}

		for (int i = 0; i < aPad.getFloor().length; i++) {
			for (int j = 0; j < aPad.getFloor().length; j++) {
				if (aPad.getFloor()[i][j] == 0) {
					System.out.print("  ");
				} else if (aPad.getFloor()[i][j] == 1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	@Test
	void drawWithZeroSteps() {
		Assertions.assertThrows(TurtleException.class, () -> {
			myTurtle.draw(0, aPad);
		});
	}

	@Test
	void drawWithTooManyStepsFromCurrentColumnPosition() {
		myTurtle.setColumnCoordinate(13);
		myTurtle.setTurtleOrientation(Orientation.COLUMN_RIGHT);
		Assertions.assertThrows(TurtleException.class, () -> {
			myTurtle.draw(10, aPad);
		});

	}
	@Test
	void drawWithTooManyStepsFromCurrentRowPosition() {
		myTurtle.setRowCoordinate(0);
		myTurtle.setTurtleOrientation(Orientation.COLUMN_RIGHT);
		Assertions.assertThrows(TurtleException.class, () -> {
			myTurtle.draw(22, aPad);
		});

	}
}
