package chapterExercises;

public class OddIntegerProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 1;

		for (int i = 1; i <= 15; i += 2) {

			total *= i;

		}

		System.out.println("Product of Odd integer between 1 and  15 is " + total);

	}

}
