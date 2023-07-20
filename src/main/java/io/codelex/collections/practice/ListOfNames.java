package io.codelex.collections.practice;

import java.util.*;

public class ListOfNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> listOfNames = new HashSet<>();
        String name;

        do {
            System.out.print("Enter name: ");
            name = in.nextLine().trim();

            if (!name.isEmpty()) {
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                listOfNames.add(name);
            }
        } while (!name.isEmpty());

        System.out.print("Unique name list contains: ");
        for (String el : listOfNames) {
            System.out.print(el + " ");
        }

    }
}
