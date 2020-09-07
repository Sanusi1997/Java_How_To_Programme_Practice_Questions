package com.exercises;

import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        //request and store user input
        System.out.println("Enter number to inspect whether it is prime or not: ");
        int userInput = input.nextInt();

        //declare list to store factor of number
        List<Integer> factors = new ArrayList<>();
        
        //method checks for factor of the number and adds to a list
        addToList(userInput, factors);
        
        //method returns the prime status of the number as 
        boolean primeValue = isPrime(factors);

        
        
        //if number is not prime, go ahead to look for prime factors of number in question
        
        if (primeValue == false) {
            System.out.println( userInput + " is not a prime number");
            System.out.print("The prime factors of " + userInput + " are: ");
            
            //declare list to look for factors of each individual number and determine their prime status
            List<Integer> newFactorList = new LinkedList<>();
            
          //declare new list to store number that is prime from sequence above
            List<Integer> newFactorList2 = new LinkedList<>();
            
            
            //loop through each factor of the original number and determine thie prime status
            for (int i = 0; i < factors.size(); i++) {
                addToList(factors.get(i), newFactorList);
                boolean factorState = isPrime(newFactorList);
                if (factorState == true) {
                    newFactorList2.add(factors.get(i));
                }
                newFactorList.clear();

            }
            // declare set to get list of prime factors as unique 
            Set<Integer> uniqueFactor = new HashSet<>(newFactorList2);
            
            // display  prime factors as unique number
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
