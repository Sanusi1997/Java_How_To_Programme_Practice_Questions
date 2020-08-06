package chapterExercises;

import java.util.Scanner;


public class DayChecker {

	
	public String  check() {
		
		int num = 0;
		int week = 0;
	 Scanner input = new Scanner (System.in);
	
	 System.out.println("Enter Number");
	 int  number = input.nextInt();
	 
	 
	    num = number % 7;
	    week = 1 + (number / 7);
	    String result = "";
	    
	    
	    if (number < 0) {
	    	System.out.println("Enter a valid Number");
	    	
	    }
	    switch(num ) {
	    
	 
	    case 0:
	    	result = "Sunday";
	    	System.out.printf("This is week %d%n", week);
	    	break;
	    case 1:
	    	result = "Monday";
	    	System.out.printf("This is week %d%n", week);
	    	break;
	    	
	    case 2:
 	       result = "Tuesday";
 	      System.out.printf("This is week %d%n", week);
 		   break;
 	
	    case 3:
 	      result = "Wednesday";
 	     System.out.printf("This is week %d%n", week);
 		  break;
 		
	    case 4:
 	      result = "Thursday";
 	     System.out.printf("This is week %d%n", week);
 		  break;
	    case 5:
	 	   result = "Friday";
	 	  System.out.printf("This is week %d%n", week);
	 	   break;
	    case 6:
		 	result = "Saturday";
		  System.out.printf("This is week %d%n", week);
		 	   break;
 	default:
 		System.out.println("Not a valid operation");
 		break;
	 
	    }
	    return result;
}
	
}	
