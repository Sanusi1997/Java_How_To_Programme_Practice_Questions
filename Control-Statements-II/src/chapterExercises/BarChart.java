package chapterExercises;

public class BarChart {

	public static int number1;
	public static int number2;
	public static int number3;
	public static int number4;
	public static int number5;

	public static int getNumber1() {
		return number1;
	}

	public static void setNumber1(int number1) {
		BarChart.number1 = number1;
	}

	public static int getNumber2() {
		return number2;
	}

	public static void setNumber2(int number2) {
		BarChart.number2 = number2;
	}

	public static int getNumber3() {
		return number3;
	}

	public static void setNumber3(int number3) {
		BarChart.number3 = number3;
	}

	public static int getNumber4() {
		return number4;
	}

	public static void setNumber4(int number4) {
		BarChart.number4 = number4;
	}

	public static int getNumber5() {
		return number5;
	}

	public static void setNumber5(int number5) {
		BarChart.number5 = number5;
	}

	public static void barChartPrinter(int num1, int num2, int num3, int num4, int num5) {

		if (num1 > 31 && num2 > 31 && num3 > 31 && num4 > 31 && num4 > 31
				|| num1 < 1 && num2 < 1 && num3 < 1 && num4 < 1 && num5 < 1) {
			System.out.print("Enter a Valid Number");
		} else {

			for (int i = 1; i <= num1; i++) {
				System.out.println("*");
			}

			for (int i = 1; i <= num2; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 1; i <= num3; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 1; i <= num4; i++) {
				System.out.print("*");
			}

			System.out.println();

			for (int i = 1; i <= num5; i++) {
				System.out.print("*");
			}

		}
	}
}
