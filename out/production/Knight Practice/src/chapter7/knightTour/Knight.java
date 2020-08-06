package chapter7.knightTour;

public class Knight {
	private Movement knightMovement;
	private MovementType knightMovement2;
	private int column;
	private int row;

	public MovementType getKnightMovement2() {
		return knightMovement2;
	}

	public void setKnightMovement2(MovementType knightMovement2) {
		this.knightMovement2 = knightMovement2;
	}

	public Movement getKnightMovement() {
		return knightMovement;
	}

	public void setKnightMovement(Movement knightMovement) {
		this.knightMovement = knightMovement;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void move(ChessBoard gameBoard, int number) {
		int currentRow = gameBoard.getBoard().length - 5;
		int currentColumn = gameBoard.getBoard().length - 4;

		switch (this.knightMovement2) {
		case ONE:
			this.setKnightMovement2(knightMovement2.ONE);
			for (int i = currentRow; i < 5; i++) {
				int rowMove = gameBoard.getBoard()[i][currentColumn];
				currentRow++;
				for (int j = currentColumn; j < 5; j++) {

					int columnMove = gameBoard.getBoard()[currentRow][j];
					currentColumn++;
				}
			}
			break;
		}

	}
}
