package com.exercises;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListInsertion {
    public static void main(String... args) {
        //create Secure Random Object to generate random numbers
        SecureRandom random = new SecureRandom();

        //initialize start and end for loop range
        int endRange = 25;
        int startRange = BigInteger.ZERO.intValue();

        List<Double> numberList = new LinkedList<>();

        //loop 25 times to generate 25random numbers
        for (int start = startRange; start < endRange; start++) {
            double number = random.nextInt(101);
            numberList.add(number);
        }

        //sort number list in natural order
        Collections.sort(numberList);

        //display number in list to user
        displayList(numberList);

        //sum the numbers in list. Get the average and display it
        System.out.println("\nSum of numbers in list: " + sumList(numberList));
        System.out.printf("Average of numbers in list: %.2f", sumList(numberList) / endRange);

    }

    public static double sumList(Collection<Double> list) {
        double total = 0;
        for (Double number : list)
            total += number;

        return total;
    }

    public static void displayList(Collection<Double> list) {
        for (Double number : list)
                System.out.print(number + " ");

    }
}
