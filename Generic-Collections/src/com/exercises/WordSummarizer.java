package com.exercises;

import java.util.*;

public class WordSummarizer {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        // request and accept user input
        System.out.println("Please enter sentence to analyze:");
        String userInput = input.nextLine();

        //tokenize user input


        String[] sentence = userInput.split(" ");

        //initialize map to store word and frequency
        Map<String, Integer> wordMap = new HashMap<>();

        //populate map with words as keys and counts as values
        for (String word : sentence)
            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word);
                wordMap.put(word.toLowerCase(), count + 1);
            } else {
                wordMap.put(word.toLowerCase(), 1);
            }

        //get keys as set
        Set<String> sentenceKeys = wordMap.keySet();

        //sort keys in ascending oder

        SortedSet<String> sortedKeys = new TreeSet<>(sentenceKeys);


        System.out.println("\nWord Summary \nWord:\tCount");
        //print each word and their count in the program

        for (String key : sortedKeys)
            System.out.printf("%-6s%5d%n", key, wordMap.get(key));

    }
}
