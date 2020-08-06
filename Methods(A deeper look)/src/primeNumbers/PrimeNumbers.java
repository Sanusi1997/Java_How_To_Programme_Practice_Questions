package primeNumbers;

public class PrimeNumbers {
	public static int number;

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		PrimeNumbers.number = number;
	}

	public static void checkFactor(int number) {
		int total = 0;
		int factors = 0;
		int counter = 1;
		int factorsCount = 0;
		while (counter <= number) {
			for (int i = 0; i <= counter; i++) {
				if (number % counter == 0 & counter > 0) {
					factors = counter;
					factorsCount++;
					System.out.print(counter + " ");

				}
				break;
			}
			counter++;

		}
		System.out.println();
		System.out.println(factorsCount);

		if (factorsCount > 2) {
			System.out.printf("%d is not a prime number", number);
		}
		
		else if(number == 1) {
			System.out.printf("%d is not a prime number", number);
			
		}

		else {
			System.out.printf("%d is a prime number", number);

		}
	}

}