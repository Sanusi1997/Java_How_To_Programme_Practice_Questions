package com.employee;

public class BaseCommissionEmployee {

	private CommissionEmployee employee;
	private double baseSalary;

	public BaseCommissionEmployee(CommissionEmployee employee, double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.employee = employee;
		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public String toString() {
		return String.format("%s %n%s%s: %.2f%n", "Base Commission Employee details", employee, "Base Salary",
				getBaseSalary());
	}

}
