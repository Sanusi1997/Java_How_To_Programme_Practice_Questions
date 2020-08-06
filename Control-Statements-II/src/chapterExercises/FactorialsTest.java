package chapterExercises;

public class FactorialsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long total = 1;
		int number = 1;
		while (number <= 20) {

			total = total * number;
			
			System.out.println(number +"Factorial is " + total);
			
			
			number ++; 
			
		}
		

	}

}
