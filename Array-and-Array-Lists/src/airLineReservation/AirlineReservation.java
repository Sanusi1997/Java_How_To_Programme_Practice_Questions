package airLineReservation;

import java.util.Scanner;

public class AirlineReservation {

	public static void main(String... args) {

		// Initialize airline seats to false
		boolean[] seats = new boolean[11];
		Scanner input = new Scanner(System.in);

		// Initialize seat counters on airline
		int seatCounterA = 1;
		int seatCounterB = 6;

		// choice of 1 or 2 to be assigned a seat in economy or first class
		int seatType = 0;

		// loop continuously until all seats are filled

		while (true) {

			System.out.println("Please type 1 for first class or type 2 for economy: ");

			seatType = input.nextInt();

			switch (seatType) {

			case 1:

				// If first class seats are filled, customer is requested to be re-assigned to
				// economy or wait for next available flight
				if (seats[5] == true && seats[10] != true) {
					System.out.println("First class is filled! Please type 3 to be reassigned to economy: ");
					seatType = input.nextInt();

					if (seatType == 3) {
						System.out.println("Successfully re-assigned to economy!");
						seats[seatCounterB] = true;
						System.out.println("Thanks for flying economy. Your seat is " + seatCounterB);
						seatCounterB++;
						break;
					} else {
						System.out.println("Next Flight leaves in 3 hours!");
					}

				}
				// If first class seats are available, customer is assigned a seat successfully
				seats[seatCounterA] = true;
				System.out.println("Thanks for flying first class. Your seat is " + seatCounterA);
				seatCounterA++;
				break;

			case 2:
				// If economy seats are filled, customer is requested to be re-assigned to
				// first class or wait for next available flight
				if (seats[10] == true && seats[5] != true) {
					System.out.println("Economy is filled! Please type 4 to be reassigned to first class: ");
					seatType = input.nextInt();
					if (seatType == 4) {
						System.out.println(" Successfully re-assigned to first class");
						seats[seatCounterA] = true;
						System.out.println("Thanks for flying first class. Your seat is " + seatCounterA);
						seatCounterA++;
						break;
					} else {
						System.out.println("Next Flight leaves in 3 hours!");
					}
				}
				// If economy seats are available, customer is assigned a seat successfully
				seats[seatCounterB] = true;
				System.out.println("Thanks for flying economy. Your seat is " + seatCounterB);
				seatCounterB++;
				break;

			}

			// Once all seats are filled, the loop is terminated
			if (seats[5] == true && seats[10] == true) {
				System.out.println();
				System.out.println("Flight tickets for this hour are finished. Check back in three hours");
				break;
			}
		}

	}

}
