package rightAngleTriangle;
import java.util.Scanner;

public class RightAngleTriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first side of the Triangle:  ");
		double side1 = input.nextDouble();
		
		System.out.println("Enter the second side of the Triangle:  ");
		double side2 = input.nextDouble();
		
		
		double side3 = RightAngleTriangle.hypothenuseCalculator(side1, side2);

		System.out.printf("The Hypothenuse of the given right Triangle is : %f%n ", side3);


	}

}
