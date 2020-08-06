package ChapterExercises;

import java.util.Scanner;

public class GasMileAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// prompt user for miles driven
		System.out.println("Enter miles driven for this trip or 0 to quit: ");
		int milesDriven = input.nextInt();

		// prompt user gallons used
		System.out.println("Enter gallons used for this trip or 0 to quit: ");
		int gallonsUsed = input.nextInt();

		int totalGallonsUsed = 0;
		int totalMilesDriven = 0;

		while (milesDriven != 0  || gallonsUsed != 0) {

			if (gallonsUsed > 0 && milesDriven > 0) {
				double milesPerGallon = (double) milesDriven / gallonsUsed;
				System.out.printf("Miles per gallon for this trip is: %.2f%n", milesPerGallon);

				totalGallonsUsed += gallonsUsed;
				totalMilesDriven += milesDriven;

				System.out.println("Enter miles driven for this trip or 0 to quit: ");
				milesDriven = input.nextInt();

				System.out.println("Enter gallons used for this trip or  0 to quit: ");
				gallonsUsed = input.nextInt();

				if (gallonsUsed == 0 || milesDriven == 0) {

					double combinedMilesPerGallonDriven =  (double ) totalMilesDriven / totalGallonsUsed;

					System.out.printf("Total Miles driven for the combined trip is: %d%n", totalMilesDriven);
					System.out.printf("Total Gallon of fuel for the combined is: %d%n", totalGallonsUsed);
					System.out.printf("The combined miles per gallon for the whole trip is: " + "%.2f%n",
							combinedMilesPerGallonDriven);

				}
			} else if(gallonsUsed < 0 || milesDriven < 0) {
				System.out.println("Value not valid!");
				break;

			}

		}

	}

}
