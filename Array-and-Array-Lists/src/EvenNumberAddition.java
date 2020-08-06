import java.security.SecureRandom;

public class EvenNumberAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();

		int[] AddNumber = new int[20];

		System.out.print("Random Numbers Generated are : ");
		for (int i = 0; i < AddNumber.length; i++) {

			AddNumber[i] = randomNumbers.nextInt(21);

			System.out.print(" ");
			System.out.print(AddNumber[i]);

		}
		int sum = 0;
		System.out.println(" ");
		System.out.print("Even Numbers are : ");
		for (int values : AddNumber) {
			if (values % 2 == 0 && values != 20 && values != 0) {
				sum += values;
				System.out.print(" ");
				System.out.print(values);
			}
		}
		System.out.println(" ");
		System.out.print("The sum of the even numbers is : " + sum);
	}

}
