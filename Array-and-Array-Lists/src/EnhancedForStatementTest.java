

public class EnhancedForStatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		
		for(String value : args){
			
			total += Double.parseDouble(value);
			
		}
		System.out.print("Total is " + total);
	}

}
