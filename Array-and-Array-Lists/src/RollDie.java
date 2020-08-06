import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();

		int[] Frequency = new int[7];

		System.out.printf("%s\t%s%n", "Face", "Frequency");

		for (int i = 1; i <= 60_000_000; i++)

			++Frequency[1 + randomNumbers.nextInt(6)];
		

		for (int face = 1; face < Frequency.length; face++)
			System.out.printf("%d\t%d%n", face, Frequency[face]);

	}

}
