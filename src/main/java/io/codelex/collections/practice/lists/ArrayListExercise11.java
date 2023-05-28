package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("G");
        list.add("K");
        list.add("H");
        list.add("C");
        list.add("J");
        list.add("D");
        list.add("B");
        list.add("F");
        list.add("I");
        list.add("A");
        list.add(4, "E");
        list.set((list.size() -1), "Foobar");
        Collections.sort(list);
        System.out.println("Contains 'Foobar' :" + list.contains("Foobar"));
        for (String el : list) {
            System.out.println(el);
        }
    }

}
