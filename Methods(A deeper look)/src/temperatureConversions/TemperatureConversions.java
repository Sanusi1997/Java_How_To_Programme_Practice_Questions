package temperatureConversions;

public class TemperatureConversions {

	public static char degree;

	public static char getDegree() {
		return degree;
	}

	public static void setDegree(char degree) {
		TemperatureConversions.degree = degree;
	}

	public static void calculateTemperatureInCelsisus(double temp, char A) {
		if (getDegree() == 'A' || getDegree() == 'a') {

			double celsius = 5.0 / 9.0 * (temp - 32);
			double fahrenheit = temp;

			System.out.printf("Temperature in degree celsius is : %.2f", celsius);
		}
	}

	public static void calculateTemperatureInFahrenheit(double temp2, char B) {

		if (getDegree() == 'B' || getDegree() == 'b') {
			double fahrenheit = 9.0 / 5.0 * (temp2 + 32);

			double celsius = temp2;
			System.out.printf("Temperature in degree fahrenheit is : %.2f", fahrenheit);

		}
	}

}
