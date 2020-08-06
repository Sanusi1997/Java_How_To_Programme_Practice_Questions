package parkingCharges;

import java.util.Scanner;

public class ParkingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int customers = 0;
		int totalNumberOfHours = 0;
		double currentCost = 0.0;
		double totalCost = 0.0;

		int numOfHours = 0;

		System.out.println(
				"Please enter number of hours parked in the garage. It should not be negative" + " or exceeed 24! : ");
		numOfHours = input.nextInt();

		do {

			currentCost = calculateCharges(numOfHours);

			if (numOfHours <= 0 || numOfHours > 24) {

				System.out
						.println("Please enter number of hours parked again!.It should not be negative or exceeed 24! "
								+ "or Enter -1 to quit : ");
				numOfHours = input.nextInt();

			}

			totalCost += currentCost;
			totalNumberOfHours += numOfHours;

			System.out.println("Please enter number of hours parked again!.It should not be negative or exceeed 24! "
					+ "or Enter -1 to quit : ");
			numOfHours = input.nextInt();

			customers++;

		} while (numOfHours != -1);

		System.out.printf("Current Cost for Customer is %.2f Naira %n", currentCost);
		System.out.printf("Total Number of Customers is %d%n", customers);
		System.out.printf("Total Costs for yesterday is %.2f Naira %n", totalCost);
		System.out.printf("Total Number of hours parked for all customers is %d hours", totalNumberOfHours);
	}

	public static double calculateCharges(double hoursParked) {
		double garageCost = 0.0;
		if (hoursParked <= 3)
			garageCost = 2.0;

		else if (hoursParked > 3 && hoursParked <= 19)

			garageCost = 2 + 0.5 * (hoursParked - 3);

		else if (hoursParked > 20 && hoursParked <= 24)

			garageCost = 10.0;
		return garageCost;
	}

}
