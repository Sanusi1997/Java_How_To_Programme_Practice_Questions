package ChapterExercises;

import java.util.Scanner;

public class Cryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a four digit number to encrypt: ");
		int num = input.nextInt();

		while (num <= 999 || num > 9999) {
			System.out.println("Value is not a four digit number!");
			System.out.println("Please enter a four digit number: ");
			num = input.nextInt();
		}
		
		int digitOne  = (num / 1000);
		int transformedDigitOne  = (digitOne + 7) % 10; 
		
		int digitTwo  = (num % 1000) / 100;
		int transformedDigitTwo  = (digitTwo + 7) % 10;
		
		int digitThree  = (num % 100) / 10;
		int transformedDigitThree  = (digitThree + 7)  % 10;
		
		int digitFour  = (num % 10);
		int transformedDigitFour  = (digitFour + 7)  % 10;
	
		 
		int encryptedNumber = (transformedDigitThree * 1000) + (transformedDigitFour *100) 
									+ (transformedDigitOne *10) + transformedDigitTwo;
				
		System.out.printf("Your encrypted number is : %d", encryptedNumber);
		

	}
}