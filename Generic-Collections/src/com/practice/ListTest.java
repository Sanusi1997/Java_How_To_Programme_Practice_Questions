package com.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static void main(String... args) {

        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list = new LinkedList<>();
        for (String color : colors)
            list.add(color);
        
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        for (String color : colors2)
            list2.add(color);

        list.addAll(list2);
        list2 = null;
        System.out.println("List after concatenation: ");
        printList(list);

        convertToUpperCase(list);
        System.out.println("\nList after converting to upper case: ");
        printList(list);

        removeList(list, 2, 5);
        System.out.println("\nList after removing from position 2 to 4: ");
        printList(list);

        System.out.println("\nList after reverse: ");
        reverseList(list);


    }

    private static void printList(List<String> sampleList) {
        for (String elements : sampleList)
            System.out.printf("%s ", elements);
    }

    private static void convertToUpperCase(List<String> list) {

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String color = listIterator.next();
            listIterator.set(color.toUpperCase());
        }
    }

    private static void removeList(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void reverseList(List<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.printf("%s ", listIterator.previous());

        }
    }
}
