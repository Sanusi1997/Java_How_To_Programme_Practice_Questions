package com.savings;

public class SavingsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Savings saver1 = new Savings(2000.00);
		Savings saver2 = new Savings(3000.00);
		
		Savings.modifyInterestRate(0.04);
		System.out.println("Savings Balance after 4% interest");
		System.out.println("Saver1: " +  saver1.calculateMonthlyInterest());
		System.out.println("Saver2: " + saver2.calculateMonthlyInterest());
		
		System.out.println();
		
		Savings.modifyInterestRate(0.05);
		System.out.println("Savings Balance after 5% interest");
		System.out.println("Saver1: " +  saver1.calculateMonthlyInterest());
		System.out.println("Saver2: " + saver2.calculateMonthlyInterest());
		
		

	}

}
