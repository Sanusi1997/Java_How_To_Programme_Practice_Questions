package com.payroll;

public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public Date getDate(){
        return birthDate;
    }
    public abstract double earnings();
    public  double getPaymentAmount(){
        return earnings();
    }


    public String toString() {
        return String.format("%s%n%s: %s %s%n%s: %s%n%s %s", "com.payroll.Employee Details", "com.payroll.Employee Name",
                getFirstName(), getLastName(), "Social Security Number", getSocialSecurityNumber(),
                "com.payroll.Employee's", getDate());
    }
}
