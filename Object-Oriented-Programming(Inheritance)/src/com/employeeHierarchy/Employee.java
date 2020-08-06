package com.employeeHierarchy;

public class Employee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.socialSecurityNumber = socialSecurityNumber;

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

	public String toString() {

		return String.format("%s%n%s: %s %s%n%s: %s%n", "Employee Details", "Employee Name", getFirstName(),
				getLastName(), "Social Security Number", getSocialSecurityNumber());
	}

}
