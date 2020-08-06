package ChapterExercises;

public class AsteriskPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;
		int odd = 1;

		while (counter <= 64) {
			System.out.print("*  ");
			if (counter % 8 == 0) {
				System.out.println();
				if (counter == (8 * odd)) {
					System.out.print(" ");
					odd +=2;
				}
			}
			counter++;
		}

	}

}
