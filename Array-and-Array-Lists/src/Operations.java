import java.util.Scanner;

public class Operations {
	private static Scanner input = new Scanner(System.in);

	public static void main(String... args) {
		int[] array = new int[10];
		int[] operand1 = new int[10];
		int[] operand2 = new int[10];
		char[] operator = new char[10];
		double[] result = new double[1000];

		int i = 0;
		try {
			while (i < 10) {
				System.out.print("Enter first number: ");
				int number1 = input.nextInt();
				operand1[i] = number1;
				System.out.print("Enter second number: ");
				int number2 = input.nextInt();
				operand2[i] = number2;

				System.out.print("Enter operator: ");
				char A = input.next().charAt(0);
				operator[i] = A;

				switch (operator[i]) {
				case '+':
					result[i] = operand1[i] + operand2[i];
					break;

				case '*':
					result[i] = operand1[i] * operand2[i];
					break;

				case '/':
					result[i] = operand1[i] / operand2[i];
					break;

				case '%':
					result[i] = operand1[i] % operand2[i];
					break;

				case '-':
					result[i] = operand1[i] - operand2[i];
					break;

				case '^':
					result[i] = (int) Math.pow(operand1[i], operand2[i]);

					break;

				}
				i++;

			}

			System.out.println("Operand1\t\tOperand2\t\tOperator\t\tResult");
			for (i = 0; i < result.length; i++) {

				System.out.println(+operand1[i] + "\t\t\t" + operand2[i] + "\t\t\t" + operator[i] + "\t\t\t" + result[i]);

			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}
