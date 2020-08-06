package com.payroll;

public class BasePlusCommissionEmployee extends  CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                              double commissionRate, double grossSales, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, birthDate, commissionRate, grossSales);
        if (baseSalary <= 0.0){
            throw new IllegalArgumentException("Base Salary should not be less than or equal to zero");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if (baseSalary <= 0.0){
            throw new IllegalArgumentException("Base Salary should not be less than or equal to zero");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString(){
        return String.format("%s%s: $%.2f%n", super.toString(),"Base Salary", getBaseSalary());
    }

}
