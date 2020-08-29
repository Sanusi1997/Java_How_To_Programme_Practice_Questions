package com.fileMatchingSerializer;

import java.io.Serializable;

public class AccountRecord implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    private String description;

    public AccountRecord() {
        this(0, " ", " ", 0.0);
    }



    public AccountRecord(String description, double balance) {
        this.description = description;
        this.balance = balance;
    }


    public AccountRecord(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }


    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public double combine(TransactionRecord sample){

        double newBalance =  getBalance() + sample.getTransactionAmount();
        return newBalance;
    }
}
