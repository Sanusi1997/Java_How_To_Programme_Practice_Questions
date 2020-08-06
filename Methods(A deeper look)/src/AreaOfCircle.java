import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please Radius");
		double number = input.nextDouble();
		System.out.print("Area of Circle with Radius " + number + " Cm is : " + Math.ceil(calculateArea(number)));
	}

	public static double calculateArea(double radius) {

		double Area = (Math.PI * (Math.pow(radius, 2)));
		return Area;

	}

}
