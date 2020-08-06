package chapterExercises;

import java.math.BigInteger;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principal = 1000.00;
		double years = 10;

		for (int rate = 5; rate <= 10; rate++) {

			System.out.printf("%nRate is at %d%s%n", rate, "%");
			System.out.printf("%s%40s%n", "Year", "Amount after compound interest");
			for (int i = 1; i <= 10; i++) {
				double amount = principal * (Math.pow((BigInteger.ONE.doubleValue() + ((double) rate / 100)), i));

				System.out.printf("%n%4d%,20.2f%n", i, amount);
			}
		}
	}

}
