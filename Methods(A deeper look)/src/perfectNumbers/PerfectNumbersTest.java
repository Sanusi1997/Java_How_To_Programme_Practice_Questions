package perfectNumbers;

import java.util.Scanner;

public class PerfectNumbersTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner collect = new Scanner(System.in);
		System.out.println("Please Enter a value : ");
		int value = collect.nextInt();
		PerfectNumbers.setNumber(value);
		System.out.print("The factors of " + value + " are: ");
		int total = PerfectNumbers.checkFactor(value);
		System.out.println();
		System.out.println("The sum of the factors is " + total);
		PerfectNumbers.isPerfect(total);
	}

}
