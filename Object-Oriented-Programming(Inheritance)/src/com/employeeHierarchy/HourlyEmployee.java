package com.employeeHierarchy;

public class HourlyEmployee extends Employee {

	private double hoursWorked;
	private double wage;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage,
			double hoursWorked) {

		// TODO Auto-generated constructor stub
		super(firstName, lastName, socialSecurityNumber);

		if (wage <= 0.0) {
			throw new IllegalArgumentException("Hourly wage should not be less than or equal to zero");
		}
		this.wage = wage;

		if (hoursWorked < 0.0 || hoursWorked > 168) {
			throw new IllegalArgumentException("Hours worked should not be lesser than zero or greater than 168");
		}

		this.hoursWorked = hoursWorked;
	}

	public void setWage(double wage) {
		if (wage <= 0.0) {
			throw new IllegalArgumentException("Hourly wage should not be less than or equal to zero");
		}
		this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked < 0.0 || hoursWorked > 168) {
			throw new IllegalArgumentException("Hours worked should not be lesser than zero or greater than 168");
		}

		this.hoursWorked = hoursWorked;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public double earnings() {

		double salary = 0.0;

		if (getHoursWorked() > 40) {
			salary = (1.5 * getWage()) * getHoursWorked();
		} else {
			salary = getWage() * getHoursWorked();
		}
		return salary;
	}

	@Override

	public String toString() {

		return String.format("%s%s: %.2f%n%s: $%.2f", super.toString(), "Hours Worked", getHoursWorked(),
				"Hourly Wage", getWage());
	}

}
