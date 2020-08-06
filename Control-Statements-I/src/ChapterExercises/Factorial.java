package ChapterExercises;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number you want the factorial: ");
		int number = input.nextInt();
		if (number > 0) {
			int control = 0;
			double factorial = 1;

			while (control < number) {
				factorial *= (number - control);
				control++;
			}
			System.out.printf("The factorial of %d is: %.1f", number, factorial);
		}
	}

}
