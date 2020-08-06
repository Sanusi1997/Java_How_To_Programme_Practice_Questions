package chapterExercises;

public class TrianglePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Triangle 1
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();
		// Triangle 2
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();
		
		// Triangle 3
		for (int x = 10; x >= 1; x--) {
			for (int y = x; y < 10; y++) {

				System.out.print(" ");
			}
			for (int i = x; i >= 1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
		//Triangle 4
		for (int a = 1; a <= 10; a++) {
			for (int b = a; b <= 10; b++) {

				System.out.print(" ");
			}
			for (int i = a; i > 1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Triangle Print  on a straight line
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("          ");
			for (int m = 10 ; m >= i ; m--) {
				System.out.print("*");

			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*");

			}
			System.out.print("          ");
			
			for (int n = 10; n >= i; n--) {
				System.out.print("*");

			}
			System.out.print("         ");
			for (int y = i; y < 10; y++) {

				System.out.print(" ");
			}
			for (int p = i; p >= 1; p--) {
				System.out.print("*");
			}

			System.out.println();
			

		}
		

	}
}
