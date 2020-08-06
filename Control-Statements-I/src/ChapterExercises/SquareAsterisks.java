package ChapterExercises;

import java.util.Scanner;

public class SquareAsterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number Between 1 and 20: ");
		int number = input.nextInt();

		int i = 1;
		while (i <= number * number) {

			System.out.print("*");
			if (i % number == 0) {
				System.out.println(" ");
			}

			i++;

 		}
	}

}
