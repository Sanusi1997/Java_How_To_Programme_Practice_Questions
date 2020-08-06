import java.util.Scanner;

public class SquareOfAsterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Side of Square");
		int number = input.nextInt();
		squareAsterisks(number);
	}
	
		public static void squareAsterisks(int side) {
			
			for (int i = 1; i <=  side * side; i++) {
				
				System.out.print("*");
				if (i % side == 0) {
					System.out.println(" ");
				}
				
				
				
			}
			
		}
	
}
