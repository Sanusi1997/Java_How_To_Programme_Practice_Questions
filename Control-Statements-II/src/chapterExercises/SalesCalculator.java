package chapterExercises;

import java.util.Scanner;

public class SalesCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int productOneQty = 0;
		int productTwoQty = 0;
		int productThreeQty = 0;
		int productFourQty = 0;
		int productFiveQty = 0;

		double productOnePrice = 2.98;
		double productTwoPrice = 4.50;
		double productThreePrice = 9.98;
		double productFourPrice = 4.59;
		double productFivePrice = 6.87;

		double retailValueOne;
		double retailValueTwo;
		double retailValueThree;
		double retailValueFour;
		double retailValueFive;

		Scanner input = new Scanner(System.in);
		int productChoice = 0;

		System.out.println("Enter choice of product from 1-5: ");
		productChoice = input.nextInt();

		do {

			switch (productChoice) {

			case 1:
				productOneQty++;
				retailValueOne = productOnePrice * productOneQty;
				break;
			case 2:
				productTwoQty++;
				break;
			case 3:

				productThreeQty++;
				break;
			case 4:

				productFourQty++;
				break;
			case 5:
				productFiveQty++;
				break;

			}
			System.out.println("Enter choice of product from 1-5: or negative values to quit ");
			productChoice = input.nextInt();

		} while (productChoice > 0);

		System.out.printf("%12s%15s%20s%16s%n", "Product Type", "Product Price", "Quantity Purchased",
				"Total Purchase");
		System.out.println("------------------------------------------------------------------");

		retailValueOne = productOnePrice * productOneQty;
		retailValueTwo = productTwoPrice * productTwoQty;
		retailValueThree = productThreePrice * productThreeQty;
		retailValueFour = productFourPrice * productFourQty;
		retailValueFive = productFivePrice * productFiveQty;

		double totalPrice = retailValueOne + retailValueTwo + retailValueThree + retailValueFour + retailValueFive;

		System.out.printf("%-15s%3.2f%20d%20.2f%n", "Product One", productOnePrice, productOneQty, retailValueOne);
		System.out.printf("%-15s%3.2f%20d%20.2f%n", "Product Two", productTwoPrice, productTwoQty, retailValueTwo);
		System.out.printf("%-15s%3.2f%20d%20.2f%n", "Product Three", productThreePrice, productThreeQty,
				retailValueThree);
		System.out.printf("%-15s%3.2f%20d%20.2f%n", "Product Four", productFourPrice, productFourQty, retailValueFour);
		System.out.printf("%-15s%3.2f%20d%20.2f%n", "Product Five", productFivePrice, productFiveQty, retailValueFive);
		System.out.printf("%60s%n%60.2f", "-----------------------------------------", totalPrice);
	}

}
