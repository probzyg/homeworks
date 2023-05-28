package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List arrayList = Arrays.asList(array);
        System.out.println(arrayList);

        HashSet<String> hashSet = new HashSet<>(List.of(array));
        System.out.println(hashSet);


        String[] arrayOrigination = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};
        Map<String, String> hashMap = new HashMap<String, String>();
        for (int i = 0; i < array.length; i++) {
            String arrayElement = array[i];
            String arrayOriginationElement = arrayOrigination[i];
            hashMap.put(arrayElement,arrayOriginationElement);
        }
        System.out.println(hashMap);
    }
}
