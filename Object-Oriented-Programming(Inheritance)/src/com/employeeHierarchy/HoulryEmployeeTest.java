package com.employeeHierarchy;

public class HoulryEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HourlyEmployee testEmployee = new HourlyEmployee("Orleope", "Waheed", "444-555-666", 25, 22);
		System.out.print(testEmployee);
		System.out.printf("%n%s %s %s %.2f hour is $%.2f", testEmployee.getFirstName(), testEmployee.getLastName(),
				"'s earnings after", testEmployee.getHoursWorked(), testEmployee.earnings());
	}

}
