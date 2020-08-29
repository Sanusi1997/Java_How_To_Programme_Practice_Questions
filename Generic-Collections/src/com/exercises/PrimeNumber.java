package com.exercises;

import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to inspect whether it is prime or not: ");
        int userInput = input.nextInt();


        List<Integer> factors = new ArrayList<>();
        addToList(userInput, factors);
        boolean primeValue = isPrime(factors);


        if (primeValue == false) {
            System.out.println("\n" + userInput + " is not a prime number");
            System.out.print("The prime factors of " + userInput + " are: ");
            List<Integer> newFactorList = new LinkedList<>();
            List<Integer> newFactorList2 = new LinkedList<>();
            for (int i = 0; i < factors.size(); i++) {
                addToList(factors.get(i), newFactorList);
                boolean factorState = isPrime(newFactorList);
                if (factorState == true) {
                    newFactorList2.add(factors.get(i));
                }
                newFactorList.clear();

            }
            Set<Integer> uniqueFactor = new HashSet<>(newFactorList2);
            displayList(uniqueFactor);


        } else {
            System.out.println("\n" + userInput + " is a prime number");
        }
    }

    public static void displayList(Collection<Integer> list) {
        for (Integer number : list)
            System.out.print(number + " ");
    }

    public static void addToList(int number, Collection<Integer> list) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
    }

    public static boolean isPrime(Collection<Integer> list) {
        boolean primeState = true;
        if (list.size() > 2 || list.size() == 1) {
            primeState = false;
        } else {
            primeState = true;
        }

        return primeState;
    }
}
