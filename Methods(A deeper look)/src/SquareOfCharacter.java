import java.util.Scanner;

public class SquareOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Side of Square");
		int number = input.nextInt();
		System.out.println("Please Enter character");
		char letter = input.next().charAt(0);

		squareAsterisks(number, letter);
	}

	public static void squareAsterisks(int side, char letter) {

		for (int i = 1; i <= side * side; i++) {

			System.out.print(letter);
			if (i % side == 0) {
				System.out.println(" ");
			}

		}
	}
}
