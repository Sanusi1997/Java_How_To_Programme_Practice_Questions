package com.string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringSearch {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        boolean state = true;

        System.out.println("Enter line of text: ");
        String word = input.nextLine();

        do {
            System.out.println("Enter 1 to search for a particular character and " +
                    "its count or 2 for summary of each letter in the word and their count");
            try {
                int choice = input.nextInt();


                if (choice == 1) {
                    System.out.println("Enter character to search: ");
                    String searchLetter = input.next().toLowerCase();
                    char c = searchLetter.charAt(0);
                    System.out.printf("Number of \"%c\" in \"%s\"  is: %d", c, word, numberOfCharacter(word.toLowerCase(), c));
                    numberOfCharacter(word, c);
                } else if (choice == 2) {
                    numberOfEachCharacter(word);

                } else {
                    System.err.println("Wrong input!");
                    System.out.println("Restart program and make the correct choice");
                }
                state = false;
            } catch (InputMismatchException e) {
                System.err.println(e);
                input.nextLine();
                System.out.println("Input has to be an integer");
            }
        } while (state);

    }

    public static int numberOfCharacter(String word, char a) {
        char[] letters = word.toCharArray();
        int characterNum = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == a) {
                ++characterNum;
            }
        }
        return characterNum;
    }

    public static void numberOfEachCharacter(String word) {
        char[] letters = word.toLowerCase().toCharArray();
        int[] numberOfLetter = new int[26];

        for (int i = 0; i < letters.length; i++) {
            ++numberOfLetter[word.toLowerCase().indexOf(letters[i])];
        }
        System.out.println("Character" + " CharacterCount");

        for (int i = 0; i < numberOfLetter.length; i++) {
            if (numberOfLetter[i] > 0) {
                System.out.println(letters[i] + ": " + "\t\t\t\t" + numberOfLetter[i]);
            }
        }

    }
}
