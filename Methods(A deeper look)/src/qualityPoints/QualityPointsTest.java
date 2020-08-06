package qualityPoints;

import java.util.Scanner;

public class QualityPointsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade, number should be between 1 and 100! : ");
		int score = input.nextInt();
		QualityPoints.setScore(score);
		QualityPoints.gradeScore(QualityPoints.getScore());

	}
}


