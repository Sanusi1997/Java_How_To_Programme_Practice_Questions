package com.employeeHierarchy;

public class BaseCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		// TODO Auto-generated constructor stub

		if (baseSalary <= 0.0) {
			throw new IllegalArgumentException("Base Salary should not be less than or equal to zero");
		}
		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary <= 0.0) {
			throw new IllegalArgumentException("Base Salary should not be less than or equal to zero");
		}
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public double earnings() {

		return getBaseSalary() + super.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s %n%s%n%s: $%.2f%n", "Base Commission Employee details", super.toString(), "Base Salary",
				getBaseSalary());
	}

}
