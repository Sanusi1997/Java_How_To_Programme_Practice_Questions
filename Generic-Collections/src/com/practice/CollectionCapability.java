package com.practice;

import java.util.*;

public class CollectionCapability {

    public static void main(String... args) {
        String name = "soliloquy";

        char[] nameArray = name.toLowerCase().toCharArray();
        Map<Character, Integer> myMap = new HashMap<>();


        for (char character : nameArray) {
            if(myMap.containsKey(character)){
                int count = myMap.get(character);
                myMap.put(character, count+1);
            }else{
                myMap.put(character, 1);

            }
        }
        Set<Character> keys = myMap.keySet();

        SortedSet<Character> sortedKeys = new TreeSet<>(keys);

        for(Character key : sortedKeys)
            System.out.printf("%c: %d%n",    key, myMap.get(key));
    }
}
