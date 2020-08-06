import java.util.Scanner;

public class SeparatingDigitsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter any integer between 1 and 99,999 : ");
		int number = input.nextInt();
		SeparatingDigits.separateDigits(number);
	}
}
