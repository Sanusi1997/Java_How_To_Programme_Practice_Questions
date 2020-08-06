import java.util.Scanner;

public class MultiplesTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter First Integer: ");
		int number1 = input.nextInt();
		System.out.println("Please Enter Second Integer:  ");
		int number2 = input.nextInt();

		boolean result = Multiples.isMultiple(number1, number2);
		System.out.println(result);
	}

}
