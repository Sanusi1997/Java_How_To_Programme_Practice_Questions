package com.chapter3Exercises;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Account femiAccount = new Account("Femi Aebayo", 2000);
		Account dayoAccount = new Account("Adedayo Salam", 3000);
		
		System.out.printf("Enter the amount to withdraw Mr.%s: ", femiAccount.getName() );
		double amountToWithdraw = input.nextDouble();
		
		femiAccount.withdrawAmount(amountToWithdraw);
		System.out.printf("Account Name: %s%nAccount Balance: %.2f", femiAccount.getName(),
				femiAccount.getBalance());
		
	}

}
