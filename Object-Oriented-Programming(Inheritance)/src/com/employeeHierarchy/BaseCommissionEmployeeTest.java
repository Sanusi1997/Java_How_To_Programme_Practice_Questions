package com.employeeHierarchy;

public class BaseCommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCommissionEmployee sampleEmployee = new BaseCommissionEmployee("Lukman", "Awari", "222-333-444", 2000, 0.8, 3000);
		System.out.print(sampleEmployee);
		System.out.printf("%s %s%s $%.2f", sampleEmployee.getFirstName(), sampleEmployee.getLastName(), "'s earning is",
				sampleEmployee.earnings());

		
	}

}
