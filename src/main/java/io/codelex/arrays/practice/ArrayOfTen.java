package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfTen {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int[] array1 = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = 1 + randomNum.nextInt(100);
        }

        String array2String = Arrays.toString(array1).replace("[", "").replace("]", "");

        array1[9] = -7;

        String array1String = Arrays.toString(array1).replace("[", "").replace("]", "");

        System.out.println("Array 1: " + array1String);
        System.out.println("Array 2: " + array2String);
    }
}
