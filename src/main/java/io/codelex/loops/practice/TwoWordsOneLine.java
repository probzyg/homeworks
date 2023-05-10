package io.codelex.loops.practice;

import java.util.Scanner;

public class TwoWordsOneLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = input.nextLine();

        System.out.println("Enter second word:");
        String secondWord = input.nextLine();

        int dotLength = 30 - firstWord.length() - secondWord.length();

        System.out.print(firstWord);
        for (int i = 0; i < dotLength; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }
}
