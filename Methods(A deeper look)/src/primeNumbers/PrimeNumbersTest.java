package primeNumbers;
import java.util.Scanner;

public class PrimeNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner collect = new Scanner(System.in);
		System.out.println("Please Enter a value : ");
		int value = collect.nextInt();
		PrimeNumbers.setNumber(value);
		PrimeNumbers.getNumber();
		PrimeNumbers.checkFactor(PrimeNumbers.getNumber());

	}

}
