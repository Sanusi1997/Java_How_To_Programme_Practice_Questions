package chapterExercises;

import java.util.Scanner;

public class BarChartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Five Numbers between 1 and 31");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		BarChart.setNumber1(num1);
		BarChart.setNumber2(num2);
		BarChart.setNumber3(num3);
		BarChart.setNumber4(num4);
		BarChart.setNumber5(num5);

		BarChart.barChartPrinter(BarChart.getNumber1(), BarChart.getNumber2(), BarChart.getNumber3(),
				BarChart.getNumber4(), BarChart.getNumber5());

	}
}
