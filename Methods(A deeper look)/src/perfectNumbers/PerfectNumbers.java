package perfectNumbers;
public class PerfectNumbers {
	public static int number;

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		PerfectNumbers.number = number;
	}

		public static int checkFactor(int number) {
			int total = 0;
			int factors = 0;
			int counter = 1;
			while (counter < number) {
				for (int i = 0; i < counter; i++) {
					if (number % counter == 0 & counter > 0 & counter != number) {
						factors = counter;
						System.out.print(counter + " ");
						total += factors;	
					}
					break;	
				}
				counter++;	
				
			}
			return total;

		}

	public static boolean isPerfect(int total) {

		if (checkFactor(getNumber()) == getNumber()) {

			System.out.println();
			System.out.println(getNumber() + " is a perfect number");
			return true;
		} else {
			System.out.println();
			System.out.println(getNumber() + " is not a perfect number");
			return false;
		}
	}
}