package com.payable;

public abstract class NewEmployee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public NewEmployee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
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

    @Override
    public String toString() {
        return String.format("%s%n%s: %s %s%n%s: %s", "Employee Details", "Employee Name",
                            getFirstName(), getLastName(), "Social Security Number", getSocialSecurityNumber());
    }
}
