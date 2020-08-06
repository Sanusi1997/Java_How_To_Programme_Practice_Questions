package com.employeeHierarchy;

public class CommissionEmployee extends Employee {

	public double grossSales;
	public double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {

		super(firstName, lastName, socialSecurityNumber);
		if (commissionRate <= 0.0 || commissionRate > 1.0) {
			throw new IllegalArgumentException("Commission rate should not be greater than 1.0 or less than 0.0");
		}
		this.commissionRate = commissionRate;

		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales should be greater than 0.0");

		}
		this.grossSales = grossSales;

	}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales should be greater than 0.0");

		}
		this.grossSales = grossSales;

	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate > 1.0) {
			throw new IllegalArgumentException("Commission rate should not be greater than 1.0 or less than 0.0");
		}
		this.commissionRate = commissionRate;

	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public double earnings() {
		return getGrossSales() * getCommissionRate();
	}

	@Override
	public String toString() {

		return String.format("%s%n%s%n%s: $%.2f%n%s: $%.2f%n", "Commission Employee Details", super.toString(),
				"Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate());

	}

}
