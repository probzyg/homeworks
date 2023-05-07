package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class UpperCaseLetters {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String input = word.nextLine();
        int upperCaseCount = 0;
        String[] splitInput = input.split("");
        String upperCaseInput = input.toUpperCase();
        String[] upperCaseSplitInput = upperCaseInput.split("");
        for (int i = 0; i < splitInput.length; i++) {
            String a = splitInput[i];
            String b = upperCaseSplitInput[i];
            if (a.equals(b)) {
                upperCaseCount++;
            }
        }

        System.out.println(upperCaseCount);
    }
}
