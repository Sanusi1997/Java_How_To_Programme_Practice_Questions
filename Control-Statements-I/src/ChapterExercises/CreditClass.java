package ChapterExercises;

public class CreditClass {

	private int accountNumber;
	private int initialBalance;
	private int totalCredit;
	private int totalItemsCharged;
	private int allowedCreditlimit;
	
	public CreditClass() {
		
	}
	
    public CreditClass(int accountNumber, int initialBalance, int TotalCredit, int totalItemsCharged, int allowedCreditLimit) {
			this.accountNumber = accountNumber;
			this.initialBalance = initialBalance;
			this.totalCredit = totalCredit;
			this.totalItemsCharged = totalItemsCharged;
			this.allowedCreditlimit = allowedCreditLimit;
			
	 }
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	public int getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}
	public int getTotalItemsCharged() {
		return totalItemsCharged;
	}
	public void setTotalItemsCharged(int totalItemsCharged) {
		this.totalItemsCharged = totalItemsCharged;
	}
	public int getAllowedCreditlimit() {
		return allowedCreditlimit;
	}
	public void setAllowedCreditlimit(int allowedCreditlimit) {
		this.allowedCreditlimit = allowedCreditlimit;
	}
	
	
	public void calculateNewbalance() {
		
			int newBalance = initialBalance + totalItemsCharged - totalCredit;
	
			if (newBalance < allowedCreditlimit  && newBalance > 0) {
				System.out.printf("The Balance is %d%n", newBalance);
			}
			  else{
					System.out.println("Credit limited exceeded!\nReduce your spendings! ");
				}
			
	
	
	}
	
		
}
