 package com.string;

import java.util.Scanner;

public class SentenceManipulator {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String sentence = input.nextLine();
        System.out.println("Sentence to upper case: " + toUpper(sentence));
        System.out.println("Sentence to lower case: " + toLower(sentence));
        System.out.println();

        String[] tokens = sentence.split(" ");
        System.out.println("Words starting with \"B\": ");
        bWordPrinter(tokens);
        System.out.println();

        System.out.println("Words ending with \"ed\": ");
        edWordPrinter(tokens);
        System.out.println();

        System.out.printf("Words reversed from \"%s\" are: %n", sentence);
        reverseSentence(tokens);
    }

    public static void reverseSentence(String[] token) {
        for (int i = token.length - 1; i >= 0; i--) {
            System.out.println(token[i]);

        }
    }

    public static String toUpper(String word) {
        return word.toUpperCase();

    }

    public static String toLower(String word) {
        return word.toLowerCase();

    }

    public static void bWordPrinter(String[] tokens) {

        for (String token : tokens) {
            if (token.toLowerCase().startsWith("b")) {
                System.out.println(token);
            }
        }
    }
    public static void edWordPrinter(String[] tokens) {

        for (String token : tokens) {
            if (token.toLowerCase().endsWith("ed")) {
                System.out.println(token);
            }
        }
    }

}
