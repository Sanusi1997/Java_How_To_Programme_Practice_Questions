package com.fileMatchingSerializer;

import java.io.Serializable;

public class TransactionRecord implements Serializable {

    private int accountNumber;
    private double transactionAmount;

    public TransactionRecord() {
        this(0, 0.0);
    }

    public TransactionRecord(int accountNumber, double transactionAmount) {
        if (transactionAmount <= 0.0)
            throw new IllegalArgumentException("Transaction amount cannot be less than or equal to zero");

        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setTransactionAmount(double transactionAmount) {
        if (transactionAmount <= 0.0)
            throw new IllegalArgumentException("Transaction amount cannot be less than or equal to zero");
        this.transactionAmount = transactionAmount;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

}
