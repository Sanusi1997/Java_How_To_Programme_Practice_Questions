package ChapterExercises;
import java.util.Scanner;
public class CreditClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);
			CreditClass joyce =	new CreditClass();
			
	
			System.out.println("Enter Account Number: ");
			int valueForAccountNumber = input.nextInt();
			joyce.setAccountNumber(valueForAccountNumber);
			System.out.printf("Account Number is : %d%n" , joyce.getAccountNumber());
			
			System.out.println("Enter Initial Balance: ");
			int balance = input.nextInt();
			joyce.setInitialBalance(balance);
			System.out.printf("Initial Balance is : %d%n" , joyce.getInitialBalance());
			
			System.out.println("Enter Total Credit Charged: ");
			int credit = input.nextInt();
			joyce.setTotalCredit(credit);
			System.out.printf("Total Credit Charged is : %d%n" , joyce.getTotalCredit());
			
			System.out.println("Enter Total Items charged : ");
			int items = input.nextInt();
			joyce.setTotalItemsCharged(items);
			System.out.printf("Total items Charged is : %d%n" , joyce.getTotalItemsCharged());
			
			System.out.println("Enter Allowed Credit Limit: ");
			int creditLimit = input.nextInt();
			joyce.setAllowedCreditlimit(creditLimit);
			System.out.printf("Allowed Credit Limit is : %d%n" , joyce.getAllowedCreditlimit());
			
			joyce.calculateNewbalance();
		
			}
          

           }
		
                   
               
			
		
		
		
		
		
		
	


