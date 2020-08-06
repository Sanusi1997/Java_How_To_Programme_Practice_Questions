package coinTossing;

import java.security.SecureRandom;
import java.util.Scanner;

//(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//the coin appears. Display the results. The program should call a separate method flip that takes no
//arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//simulates coin tossing, each side of the coin should appear approximately half the time.]

public class CoinTossing {

	public enum CoinState {
		HEAD, TAIL
	};
	
	private static final int HEAD= 1;
	private static final int TAIL= 2;
	

	private static final SecureRandom randomNumber = new SecureRandom();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinState coin;
		int headCount = 0;
		int tailCount = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many times you would like to toss the coin: ");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			switch (flip()) {

			case HEAD:
				coin = CoinState.HEAD;
				++headCount;
				break;
			case TAIL:
				coin = CoinState.TAIL;
				++tailCount;
				break;
			}

		}

		System.out.printf("Head appeared %d time(s)%nTail appeared %d time(s)", headCount, tailCount);

	}

	public static int flip() {

		int randomValue = 1 + randomNumber.nextInt(2);

		return randomValue;

	}

}