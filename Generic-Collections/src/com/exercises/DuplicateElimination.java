package com.exercises;

import java.util.*;

public class DuplicateElimination {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        String[] namesArray = {"Bola", "Ade", "Shola", "Muiz", "Tope", "Ade"};

        List<String> nameList = new ArrayList<>();
        for(String name : namesArray)
            nameList.add(name.toLowerCase());


        SortedSet<String> sortedNames = new TreeSet<>(nameList);

        System.out.println("Enter name of interest: ");
        String interestName = input.next();

        searchFirstName(sortedNames, interestName);
    }

        public static void searchFirstName(Collection<String> names, String searchInterest){
                if (names.contains(searchInterest.toLowerCase())) {
                    System.out.println(searchInterest.toLowerCase() + " present in name register");
                } else {
                    System.out.println("Name not found");
                }

    }


}
