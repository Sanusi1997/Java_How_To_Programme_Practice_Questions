package ChapterExercises;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int number;
		int counter = 1;
		int largest = 0;

		while (counter <= 3) {
			System.out.println("Enter ten numbers: ");
			number = input.nextInt();

			if (number > largest) {

				largest = number;
			}

			counter++;

		}
		System.out.printf("The largest number is: %d%n", largest);

	}

}
