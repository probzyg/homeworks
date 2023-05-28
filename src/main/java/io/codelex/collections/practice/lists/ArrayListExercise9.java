package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise9 {

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();
        firstList.add("Red");
        firstList.add("Green");
        firstList.add("Black");
        firstList.add("White");
        firstList.add("Pink");
        System.out.println("List of first array: " + firstList);

        List<String> secondList = new ArrayList<>();
        secondList.add("Red");
        secondList.add("Green");
        secondList.add("Black");
        secondList.add("Pink");
        System.out.println("List of second array: " + secondList);

        firstList.addAll(secondList);
        System.out.println(firstList);
    }

}
