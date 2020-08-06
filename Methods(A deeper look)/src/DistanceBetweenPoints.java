import java.util.Scanner;

public class DistanceBetweenPoints {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter y coordinates : ");
		int y1 = input.nextInt();
		int y2 = input.nextInt();
		System.out.println("Please enter X coordinates : ");
		int x1 = input.nextInt();
		int x2 = input.nextInt();
		System.out.printf("The distance between x and y coordinates is %.2f", calculateDistance(y1, y2, x1, x2));

	}

	public static double calculateDistance(double a, double b, double c, double d) {

		double distance = Math.sqrt(Math.pow((b - a), 2) + Math.pow((d - c), 2));
		return distance;
	}

}
