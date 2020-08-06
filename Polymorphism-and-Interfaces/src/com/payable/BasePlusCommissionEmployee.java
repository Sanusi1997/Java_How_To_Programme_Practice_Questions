package com.payable;

public class BasePlusCommissionEmployee extends CommissionEmployee  {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
        if (baseSalary <= 0.0) {
            throw new IllegalArgumentException("Base Salary should not be less than or equal to zero");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0.0) {
            throw new IllegalArgumentException("Base Salary should not be less than or equal to zero");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }

    @Override
    public String toString() {
        return String.format("%s%s: $%.2f%n", super.toString(), "Base Salary", getBaseSalary());
    }

}