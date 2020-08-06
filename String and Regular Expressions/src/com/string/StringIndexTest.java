package com.string;

import java.util.Scanner;

public class StringIndexTest {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        StringIndex word = new StringIndex("Ade");

        System.out.println("Please enter word: ");
        String userWord = input.nextLine();
        word.setWord(userWord);
        String useWord = word.getWord();

        System.out.println("Enter Character to search: ");
        String userChar = input.nextLine();
        char userCharacter = userChar.toLowerCase().charAt(0);

       System.out.printf("The index of \"%s\" in \"%s\" is: %d", userChar, useWord, useWord.indexOf(userCharacter));
       System.out.printf("%n%nThe last index of \"%s\" in \"%s\" is: %d", userChar, useWord, useWord.lastIndexOf(userCharacter));

    }
}
