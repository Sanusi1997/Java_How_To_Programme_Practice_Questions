import java.util.Scanner;

public class RoundingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		double number = sc.nextDouble();
		System.out.printf("The nearest whole number is %.1f", roundUpNumbers(number));

	}

	public static double roundUpNumbers(double number) {

		double y = Math.floor(number + 0.5);

		return y;
	}
}
