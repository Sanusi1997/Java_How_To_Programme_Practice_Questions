package com.employee;

public class CommissionEmployee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate > 1.0 ) {
			throw new IllegalArgumentException("Commission rate should not be greater than 1.0 or less than 0.0");
		}

		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales should be greater than 0.0");
		}

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales <= 0.0) {
			throw new IllegalArgumentException("Gross Sales should not be less than or equal to 0.0");
		}
		this.grossSales = grossSales;

	}
	public double getGrossSales() {
		return grossSales;
	}

	public void setCommisssionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate > 1.0 ) {
			throw new IllegalArgumentException("Commission rate should not be greater than 1.0 or less than 0.0");
		}
		this.commissionRate = commissionRate;

	}
	public double getCommissionRate() {
		return commissionRate;
	}
	
	
	public double earnings() {
		
		return getCommissionRate() * getGrossSales();
		
	}
	

	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n", "Employee Name", getFirstName(), getLastName(),
							"Social Security Nuber", getSocialSecurityNumber(), "Gross Sales", getGrossSales(), "Commission Rate",
							getCommissionRate());
	}

}
