import java.util.Scanner;
import java.security.SecureRandom;

public class Craps {

	private static final SecureRandom randomValue = new SecureRandom();

	private enum Status {
		WIN, LOST, CONTINUE
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myPoints = 0;
		
		int lose = 0;
		int win = 0;

		Status gameStatus;

		for (int game = 1; game <= 1000000; game++) {
			int diceSum = rollDice();
			switch (diceSum) {

			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				lose++;
				break;

			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WIN;
				win++;
				break;

			default:
				gameStatus = Status.CONTINUE;
				myPoints = diceSum;
				break;
			}

			while (gameStatus == Status.CONTINUE) {
				diceSum = rollDice();
				if (diceSum == myPoints) {
					gameStatus = Status.WIN;
					win++;

				} else if (diceSum == SEVEN) {

					gameStatus = Status.LOST;
					lose++;

				}

			}

			if (gameStatus == Status.WIN) {

			} else if (gameStatus == Status.LOST) {

			}
			if(game == 20) {
		
				System.out.println("Number of win(s) after 20 rolls: " + win);
				System.out.println("Number of losse(s) after 20 rolls: " + lose);

			};
		}
		System.out.println();
		System.out.println("Number of wins after a million rolls: " + win);
		System.out.println("Number of losses after a million rolls: " + lose);

	}

	public static int rollDice() {
		int die1 = 1 + randomValue.nextInt(6);
		int die2 = 1 + randomValue.nextInt(6);

		int sumOfDie = die1 + die2;
		
		return sumOfDie;
	}
}
