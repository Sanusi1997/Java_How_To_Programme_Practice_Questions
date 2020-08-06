package com.employeeHierarchy;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommissionEmployee sampleEmployee = new CommissionEmployee("Lukman", "Awari", "222-333-444", 2000, 0.8);
		System.out.print(sampleEmployee);
		System.out.printf("%s %s%s $%.2f", sampleEmployee.getFirstName(), sampleEmployee.getLastName(), "'s earning is",
				sampleEmployee.earnings());

	}

}
