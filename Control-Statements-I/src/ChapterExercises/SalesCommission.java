package ChapterExercises;

import java.util.Scanner;

public class SalesCommission {

	public void salesCommissionCalculator() {

		double grossSales = 0;
		Scanner input = new Scanner(System.in);
		double itemAmount;
		int itemCounter = 0;

		System.out
				.println("Enter 239.99 for Item1, 99.95 for Item2, 350.89 for Item 3, 129.75 for Item4 0r -3 t0 quit");
		itemAmount = input.nextDouble();

		if (itemAmount > 0) {

			while (itemAmount != -3) {

				grossSales += itemAmount;
				itemCounter++;

				System.out.println(
						"Enter 239.99 for Item1, 99.95 for Item2, 350.89 for Item 3, 129.75 for Item4 0r -3 t0 quit");
				itemAmount = input.nextDouble();
			}

			double earnings = 200 + 0.09 * (grossSales);
			System.out.printf("Total number of Item sold is : %d%n", itemCounter);
			System.out.printf("Total amount of Item sold: %.2f%n", grossSales);
			System.out.printf("Earnings for this salesperson: %.2f%n", earnings);
		}
	}

}