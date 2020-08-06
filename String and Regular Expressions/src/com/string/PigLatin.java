package com.string;

import java.util.Scanner;

public class PigLatin {
    public static void main(String ...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = input.nextLine();


        String[] tokens = sentence.split(" ");
        for(String token : tokens) {
            if (token.length() > 1) {
                System.out.println("The pig latin version of " + token + ": " + printLatinWord(token));
            }
            else{
                continue;
            }
        }
    }

    public static String printLatinWord(String word){
       String new_word = word.substring(1,word.length()) + word.substring(0,1) + "ay";
       return new_word;
    }
}
