import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner(System.in);

		int guess = 1 + randomNumber.nextInt(1000);
		int difference1, difference2;
		int guessCount = 0;

		while (true) {
			System.out.println("Please make a guess, number is between 1 and 1000: ");
			int playerGuess = input.nextInt();
			guessCount++;

			if (guess > playerGuess) {
				System.out.println("You guessed too low");

			} else if (playerGuess > guess) {
				System.out.println("You guessed too High");
			}

			else if (playerGuess == guess) {
				System.out.println("Congratulations! you guessed the number");
				System.out.println("You guessed " + guessCount + " times");

				if (guessCount <= 10) {
					System.out.println("Either you know the secret " + "or you got lucky!");
				} else {
					System.out.println("You can do better");
				}

				break;

			}

		}

	}

}
