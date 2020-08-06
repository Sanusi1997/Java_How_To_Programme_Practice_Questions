package com.string;

import java.util.Scanner;

public class StringComparator {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first word to compare: ");
        String firstInput = input.nextLine();
        System.out.println("Please enter second word to compare: ");
        String secondInput = input.nextLine();

        if((firstInput.compareTo(secondInput)) > (secondInput.compareTo(firstInput))){
            System.out.println("First input is greater than Second input") ;
        }
        else if ((firstInput.compareTo(secondInput)) < (secondInput.compareTo(firstInput))){
            System.out.println("First input is lesser than Second input");
        }else{
            System.out.println("First input is equal to second input");
        }

        if (!firstInput.regionMatches(true,1,secondInput,1,3)){
            System.out.print("Region 1-3 in first input is different in second input");
        }
        else{
            System.out.print("Region 1-3 in first input is the same in second input");
        }



    }
}
