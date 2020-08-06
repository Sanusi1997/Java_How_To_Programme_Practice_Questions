

import java.util.Scanner;

public class VariableLength {
	Scanner input = new Scanner(System.in);

	public void productOfVariableLength(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter variable length");
		int varLength = input.nextInt();
		
		int [] a = new int [varLength];
		for(int i = 0; i < varLength; i++) {
			System.out.print("Enter Number: ");
			int number = input.nextInt();
			a[i] = number;
		}
	
		int total = 1;
		for (int value : a) {

			total *= value;

		}
		System.out.println("Product of array is " + total);
	}

}
