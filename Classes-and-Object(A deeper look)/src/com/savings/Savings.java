package com.savings;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Savings {

	private double savingsBalance;
	private static double annualInterestRate;

	public Savings(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static void modifyInterestRate(double newInterestRate) {

		Savings.annualInterestRate = newInterestRate;
	}

	public double getModifiedInterest() {

		double modifiedInterest = Savings.annualInterestRate;

		return modifiedInterest;
	}

	public String calculateMonthlyInterest() {

		BigDecimal savingsBalance = BigDecimal.valueOf(getSavingsBalance());
		BigDecimal divideInterest = BigDecimal.valueOf(getModifiedInterest() / 12);
		BigDecimal monthlyInterest = savingsBalance.multiply(divideInterest);

		monthlyInterest.setScale(2, RoundingMode.HALF_EVEN);

		return NumberFormat.getCurrencyInstance().format(savingsBalance.add(monthlyInterest));

	}
}
