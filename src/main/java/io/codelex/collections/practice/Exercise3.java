package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Orange");
        mySet.add("Pink");

        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!


        for (String element : mySet) {
            System.out.println(element);
        }


        mySet.clear();
        System.out.println("Should be empty: " + mySet);

        boolean duplicate = mySet.add("Green");
        System.out.println("Added : " + duplicate);
        mySet.add("Orange");
        duplicate = mySet.add("Green");
        System.out.println("Added : " + duplicate);
        mySet.add("Purple");

        System.out.println(mySet);
    }

}
