package com.payroll;

public class EmployeeTest {
    public static void main(String args[]) {
        Date hourlyEmployeeBirthday = new Date(1, 1, 1983);
        Date salaryEmployeeBirthday = new Date(2, 9, 1993);
        Date commissionEmployeeBirthday = new Date(17, 8, 1993);
        Date basePlusCommissionEmployeeBirthday = new Date(23, 12, 1998);
        Date pieceWorkerBirthday = new Date(28, 8, 1995);

        Employee[] employees = new Employee[5];
        employees[0] = new HourlyEmployee("Max", "Scott", "11-22", hourlyEmployeeBirthday,
                200, 48);
        employees[1] = new SalariedEmployee("Adetutu", "Adeyeri", "22-44", salaryEmployeeBirthday,
                2800);
        employees[2] = new CommissionEmployee("Simon", "Diego", "33-44", commissionEmployeeBirthday,
                0.88, 8000);
        employees[3] = new BasePlusCommissionEmployee("Mesut", "Erdogan", "44-56", basePlusCommissionEmployeeBirthday,
                0.73, 2800, 4600);
        employees[4] = new PieceWorker ("Tosun", "Cenk", "38-56", pieceWorkerBirthday, 200, 28);

        for (Employee currentEmployee : employees) {
            if (currentEmployee instanceof BasePlusCommissionEmployee) {

                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                System.out.printf("(%s)%n%s%s: $%.2f%n", employee.getClass().getName(),
                        employee,"com.payroll.Employee earned", employee.earnings());
                System.out.println();
            } else {
                System.out.printf("(%s)%n%s%s: $%.2f%n", currentEmployee.getClass().getName(),
                        currentEmployee, "com.payroll.Employee earned", currentEmployee.earnings());
                System.out.println();
            }


        }
    }

}
