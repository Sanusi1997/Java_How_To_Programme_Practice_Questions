
public class SalesCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] salary = { 245, 289, 300, 750, 890, 900, 1000, 225, 550, 780, 476, 789, 987, 960, 768 };

		int[] frequency = new int[11];

		for (int workerSalary : salary) {

			++frequency[workerSalary / 100];

		}
		System.out.printf("%6s%16s%n", "Salary", "Frequency");
		System.out.println();
		for (int number = 2; number < frequency.length; number++) {

			if (number == 10) {
				System.out.printf("%9s", "$1000");

			} else {
				System.out.printf("%s%d-%s%d", "$", number * 100, "$", ((number * 100) + 99));
			}
			System.out.print("\t");	
			for(int stars = 0; stars <= frequency[number]; stars++) {
				System.out.print("*");				
				
			}
			System.out.println();
			System.out.println();
			
		}

	}

}
