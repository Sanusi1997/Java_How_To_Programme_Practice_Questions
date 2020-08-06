package ChapterExercises;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a five digit number: ");
		int num = input.nextInt();

		while (num <= 9999 || num > 99999) {
			System.out.println("Value is not a five digit number!");
			System.out.println("Please enter a five digit number: ");
			num = input.nextInt();
		}

		double r5 = ((num % 10) * Math.pow(10, 4));
		double r4 = (((num % 100) / 10) * Math.pow(10, 3));
		double r3 = (((num % 1000) / 100) * Math.pow(10, 2));
		double r2 = (((num % 10000) / 1000) * Math.pow(10, 1));
		double r1 = num / 10000;

		double numberReverse = r5 + r4 + r3 + r2 + r1;

		int checker = num * 2;
		double difference = checker - numberReverse;

		if (difference == num) {
			System.out.printf("%d is a palidrome", num);
		}

		else {
			System.out.printf("%d is not a palidrome", num);

		}

	}

}
