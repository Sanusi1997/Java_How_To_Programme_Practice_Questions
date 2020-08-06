package temperatureConversions;

import java.util.Scanner;

public class TemperatureConversionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner collect = new Scanner(System.in);
		Scanner collect2 = new Scanner(System.in);

		System.out.println("Enter Temperature to calculate : ");
		double temperature = collect.nextInt();
		System.out.println("Type A to convert to Celsius, B to Fahrenheit : ");

		char degree = collect2.nextLine().charAt(0);
		TemperatureConversions.setDegree(degree);
		TemperatureConversions.getDegree();

		TemperatureConversions.calculateTemperatureInCelsisus(temperature, degree);
		TemperatureConversions.calculateTemperatureInFahrenheit(temperature, degree);

	}

}
