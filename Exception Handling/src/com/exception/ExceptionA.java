package com.exception;

public class ExceptionA extends Exception {


    public static void throwException() throws IllegalArgumentException{
        throw new IllegalArgumentException("Value of A should be greater than zero");
    }
}
