package com.payable;

public class SalariedEmployee extends NewEmployee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary <= 0.0) {
            throw new IllegalArgumentException("Salary cannot be less than or equal to zero");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary <= 0.0) {
            throw new IllegalArgumentException("Salary cannot be less than or equal to zero");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f%n", super.toString(), "Weekly Salary", getWeeklySalary());
    }
}


