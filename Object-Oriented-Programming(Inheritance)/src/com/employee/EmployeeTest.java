package com.employee;

public class EmployeeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CommissionEmployee ade = new CommissionEmployee("Adebari", "Lukman", "222-333-444",
                50000, 0.5);
        System.out.print(ade);
        System.out.println("Employee earning is $" + ade.earnings());

        System.out.println();

        BaseCommissionEmployee tope = new BaseCommissionEmployee(ade, 27000);
        System.out.print(tope);
    }

}
