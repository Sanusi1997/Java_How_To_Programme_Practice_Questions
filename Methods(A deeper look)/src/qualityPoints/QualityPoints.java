package qualityPoints;

import java.util.Scanner;

public class QualityPoints {
	private static int score;
	public static int getScore() {
		return score;
	}
	public static void setScore(int score) {
		QualityPoints.score = score;
	}
	public static void gradeScore(int score) {

		int result = score / 10;
		if (score <= 0 || score > 100) {
			System.err.println("Please enter the specified value!");
		} else {
			switch (result) {
			case 10:
			case 9:
				System.out.println("Your quality point is " + 4);
				break;

			case 8:
				System.out.println("Your quality point is " + 3);
				break;
			case 7:
				System.out.println("Your quality point is " + 2);
				break;
			case 6:
				System.out.println("Your quality point is " + 1);
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
				System.out.println("Your quality point is " + 0);
				break;

			}
		}
	}

}
