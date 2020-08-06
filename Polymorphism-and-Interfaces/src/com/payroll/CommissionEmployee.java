package com.payroll;


public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                              double commissionRate, double grossSales){

        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(commissionRate <= 0 || commissionRate > 1){
            throw new IllegalArgumentException("Commission Rate should not be less than or equal to zero and should not be greater than one");
        }
        if (grossSales <= 0.0){
            throw new IllegalArgumentException("Gross sales should not be less than or equal to zero");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public void etCommissionRate(double commissionRate){

        if(commissionRate <= 0 || commissionRate > 1){
            throw new IllegalArgumentException("Commission Rate should not be less than or equal to zero and should not be greater than one");
        }
        this.commissionRate = commissionRate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }

    public void setGrossSales(double grossSales){
        if (grossSales <= 0.0){
            throw new IllegalArgumentException("Gross sales should not be less than or equal to zero");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    @Override
    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }
    @Override
    public String toString(){
        return String.format("%s%n%s: $%.2f%n%s: %.2f%n", super.toString(),"Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }

}
