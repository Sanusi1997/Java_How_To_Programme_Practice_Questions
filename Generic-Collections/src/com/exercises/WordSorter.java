package com.exercises;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter word to sort: ");
		String userInput = input.nextLine();
		
		String[] sentence = userInput.split(" ");
		
		SortedSet<String> sortedSentence = new TreeSet<>();
		
		for(String token: sentence)
			sortedSentence.add(token);
		
		
		for(String sortedWord : sortedSentence)
			System.out.println(sortedWord + " ");

	}

}
