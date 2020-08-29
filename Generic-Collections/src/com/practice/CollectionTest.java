package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

    public static void main(String... args) {

        String[] colors = {"RED", "YELLOW", "BLUE", "MAGENTA", "CYAN", "INDIGO"};
        List<String> list = new ArrayList<>();

        for (String color : colors)
            list.add(color);

        System.out.println("Original Colors: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));

        }
        String[] removeColors = {"RED", "YELLOW", "BLUE"};
        List<String> removeList = new ArrayList<>();
        for (String removeColor : removeColors)
            removeList.add(removeColor);
        System.out.println();
        System.out.println("Colors to remove: ");
        for (int count = 0; count < removeList.size(); count++) {
            System.out.printf("%s ", removeList.get(count));
        }

        modifyLists(list, removeList);
        System.out.println();
        System.out.println("ArrayLists after removing colors: ");

        for(String color: list)
            System.out.printf("%s ", color);


    }
    private static void modifyLists(Collection<String> collection1, Collection<String> collection2){

        Iterator<String> listIterator = collection1.iterator();
        while(listIterator.hasNext()){
            if(collection2.contains(listIterator.next())){
                listIterator.remove();
            }
        }
    }
}

