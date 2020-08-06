package com.exception;

public class ExceptionB  extends ExceptionA{

    public static void throwException() throws IllegalArgumentException{

        try{
            throw new ExceptionA();
        }
        catch (ExceptionA e){
            System.out.println("Exception in B: ");
            System.err.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
