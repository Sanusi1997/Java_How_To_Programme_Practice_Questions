package com.payable;

public class PayableInterfaceTest {
    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[6];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("Jamal", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new HourEmployee("Jamal", "Brown", "234-11-567", 200, 48);
        payableObjects[4] = new CommissionEmployee("Adetoun", "Olorunkemi",
                "892-123-456", 0.75, 2500);
        payableObjects[5] = new BasePlusCommissionEmployee("Lateef", "Adegoke",
                "192-223-456", 0.86, 2000, 5000);


        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable currentPayable : payableObjects) {
            if(currentPayable instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee baseEmployee = (BasePlusCommissionEmployee) currentPayable;
                System.out.printf("%n%s %n%s: $%,.2f%n", baseEmployee, "payment due", baseEmployee.getPaymentAmount() * 1.1);
            }else {
                System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable, "payment due", currentPayable.getPaymentAmount());
            }
        }

    }
}
