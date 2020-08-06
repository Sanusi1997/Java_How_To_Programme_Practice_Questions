package ChapterExercises;

public class TabularOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 1;
		
		System.out.printf("%s\t%s\t%s\t%s%n", "N", "10*N", "100*N", "1000*N");
		
		System.out.println();
		
		while(N <=5) {
			System.out.printf("%d\t%d\t%d\t%d%n", (N), (10 * N), (100 *N), (1000 * N));
			N++;
		}
		

	}

}
