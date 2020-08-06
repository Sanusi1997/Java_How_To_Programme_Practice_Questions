package duplicateEliminator;

import java.util.Scanner;

public class DuplicateEliminator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] array = new int[5];
		int counter = 4;
		int count = 0;
		for (int a = 0; a < array.length; a++) {
			int value = input.nextInt();
			array[a] = value;
			if (a == 0) {
				System.out.println(value);
			} else {
				for (int i = 0; i < array.length - counter; i++) {
					if (value == array[count]) {
						System.out.println(value);
						count++;
					}
				}
			}
			counter--;
		}

	}

}
