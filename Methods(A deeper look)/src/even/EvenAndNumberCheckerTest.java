package even;

import java.util.Scanner;

public class EvenAndNumberCheckerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Integer: ");
		int number = input.nextInt();
		boolean result = EvenAndOddNumberChecker.isEven(number);
		System.out.println(result);
	}

}
