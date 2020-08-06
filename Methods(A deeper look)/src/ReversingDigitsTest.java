import java.util.Scanner;
public class ReversingDigitsTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter any integer between 1 and 999,999 : ");
		int number = input.nextInt();
		ReversingDigits.reverseDigits(number);
	}
}
