package com.payroll;


public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hour) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Salary cannot be less than or equal to zero");
        }
        this.wage = wage;
        if (hour <= 0.0 || hour > 168.0) {
            throw new IllegalArgumentException("Hour cannot be less than or equal to zero or greater than 168");
        }
        this.hour = hour;
    }

    public void setWage(double wage) {
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Salary cannot be less than or equal to zero");
        }
        this.wage = wage;

    }

    public double getWage() {
        return wage;
    }

    public void setHour(double hour) {
        if (hour <= 0.0 || hour > 168.0) {
            throw new IllegalArgumentException("Hour cannot be less than or equal to zero or greater than 168");
        }
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    @Override
    public double earnings() {
        double earning = 0.0;
        if (getHour() <= 40) {
            earning = getWage() * getHour();
        } else if (getHour() > 40) {
            earning = (40 * getWage()) + ((getHour() - 40) * getWage() * 1.5);
        }
        return earning;
    }
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f%n%s: $%.2f%n", super.toString(),"Hours worked", getHour(),
                            "Hourly wage", getWage());
    }
}
