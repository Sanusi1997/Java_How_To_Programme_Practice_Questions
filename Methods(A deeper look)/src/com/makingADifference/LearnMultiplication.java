package com.makingADifference;

import java.security.SecureRandom;
import java.util.Scanner;

public class LearnMultiplication {

	private static final SecureRandom randomNumber = new SecureRandom();
	private static int number1;
	private static int number2;
	private static int rightComment;
	private static int wrongComment;
	private static int wrongResponses = 0;
	private static int rightResponses = 0;
	private static int totalResponses = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		questionGenerator();

		int product = number1 * number2;

		System.out.printf("How much is %d times %d?%n", number1, number2);

		System.out.println("Enter your answer: ");
		int userAnswer = input.nextInt();

		if (userAnswer == product) {

			rightCommentGenerator();
			while (userAnswer == product) {
				questionGenerator();
				product = number1 * number2;
				System.out.printf("How much is %d times %d?%n", number1, number2);
				System.out.println("Enter your answer: or -1 to end the session");
				userAnswer = input.nextInt();
				rightResponses++;
				if (userAnswer == product) {
					rightCommentGenerator();
				} else if (userAnswer > 0 && userAnswer != product) {
					while (userAnswer != product) {
						System.out.println("No please try again");
						System.out.printf("How much is %d times %d?%n", number1, number2);
						System.out.println("Enter your answer: ");
						userAnswer = input.nextInt();
						wrongResponses++;
						if (userAnswer == product) {
							rightCommentGenerator();
							break;
						}

					}

				} else if (userAnswer == -1) {
					break;
				}

			}
		}

		else if (userAnswer > 0 && userAnswer != product) {
			while (userAnswer != product) {
				wrongCommentGenerator();
				System.out.printf("How much is %d times %d?%n", number1, number2);
				System.out.println("Enter your answer: ");
				userAnswer = input.nextInt();
				wrongResponses++;
				if (userAnswer == product) {
					while (userAnswer == product) {
						rightCommentGenerator();
						questionGenerator();
						product = number1 * number2;
						System.out.printf("How much is %d times %d?%n", number1, number2);
						System.out.println("Enter your answer: or -1 to end the session");
						userAnswer = input.nextInt();
						rightResponses++;
						if (userAnswer == -1) {
							break;
						}
					}

				}
				if (userAnswer == -1) {
					break;
				}

			}
		}
		
		totalResponses = rightResponses + wrongResponses;
		
		double percentageCorrect = (( double) rightResponses / totalResponses) * 100; 
		System.out.printf("Number of correct reponse(s) = %d%n", rightResponses);
		System.out.printf("Number of wrong reponse(s) = %d%n", wrongResponses);
		System.out.printf("Percentage correct =  %.2f%s", percentageCorrect, "%");
		
	}

	public static void questionGenerator() {

		number1 = 1 + randomNumber.nextInt(9);
		number2 = 1 + randomNumber.nextInt(9);

	}

	public static void rightCommentGenerator() {
		rightComment = 1 + randomNumber.nextInt(4);

		switch (rightComment) {
		case 1:
			System.out.println("Very good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
	}

	public static void wrongCommentGenerator() {
		wrongComment = 1 + randomNumber.nextInt(4);

		switch (wrongComment) {
		case 1:
			System.out.println("No. Please try again");
			break;
		case 2:
			System.out.println("Wrong. Try once more");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying");
			break;
		}

	}

}
