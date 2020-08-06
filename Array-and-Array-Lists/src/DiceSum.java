import java.security.SecureRandom;

public class DiceSum {
	private static final SecureRandom randomValue = new SecureRandom();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array that stores the frequency of the sum of two dice
		int[] dieSumFrequency = new int[13];
		
		for (int i = 1; i <= 36000000; i++) {
	
			++dieSumFrequency[rollDie()];
		}
		System.out.printf("%3s\t%9s%n", "Sum", "Frequency");
		System.out.println();


		for (int sum = 2; sum < dieSumFrequency.length; sum++) {
			System.out.printf("%2d\t%9d%n", sum, dieSumFrequency[sum]);
			System.out.println();

		}

	}

	public static int rollDie() {

		int die1 = 1 + randomValue.nextInt(6);
		int die2 = 1 + randomValue.nextInt(6);

		int sumOfDie = die1 + die2;

		return sumOfDie;
	}

}
