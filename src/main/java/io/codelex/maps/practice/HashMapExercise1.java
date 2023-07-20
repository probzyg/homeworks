package io.codelex.maps.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "Black");
        myMap.put(4, "White");
        myMap.put(5, "Blue");

        System.out.println("Size of the hash map: " + myMap.size());

        if (myMap.containsKey(3)) {
            System.out.println("Contains! :)");
        } else {
            System.out.println("Does not contains. :(");
        }

        if (myMap.containsValue("White")) {
            System.out.println("Contains! :)");
        } else {
            System.out.println("Does not contains. :(");
        }

        Map<Integer, String> cloneMap = new HashMap<>(myMap);

        for(Map.Entry entry: myMap.entrySet()){
            System.out.printf("Key: %d | Value: %s", entry.getKey(), entry.getValue() + "\n");
        }

        myMap.clear();
        System.out.println("Hash map after clearing: " + myMap);
    }

}