package com.string;

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String ...args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter phone number: ");
        String phoneNumber = input.nextLine();
        String[] token = phoneNumber.split(" ");
        String new_phoneNumber = modifyAreaCode(token[0]) +  token[1].replace("-", "");;
        System.out.println("Former Number: " + phoneNumber + " \n"  + "New number: " + new_phoneNumber );
    }

    public static String modifyAreaCode(String word){
        String newAreaCode = word.substring(1,word.length() - 1);
        return newAreaCode;
    }

}
