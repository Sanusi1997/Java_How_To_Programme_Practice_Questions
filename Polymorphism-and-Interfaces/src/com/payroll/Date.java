package com.payroll;

public class Date {
    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) {

        if (month == 2) {
            if (day <= 0 || day > 29) {
                throw new IllegalArgumentException("Days in February cannot be greater than 29 or less than equal to zero");
            }
        }

        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month cannot be greater than 12 or less than equal to zero");
        }

        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException("Days cannot be greater than 31 or less than equal to zero");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    @Override
    public String toString() {
        return String.format("%s: %d-%d-%d", "Birthdate",getDay(), getMonth(), getYear());
    }


}
