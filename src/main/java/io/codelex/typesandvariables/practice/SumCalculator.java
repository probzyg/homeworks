package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.printf("Enter series of single digit numbers separated by space: ");
        String input = a.nextLine();
        String[] splitInput = input.split("\\s+");
        int sum = 0;
        for (int i = 0; i < splitInput.length; i++) {
            if (splitInput[i].length() > 1) {
                System.out.println(splitInput[i] + " is not a single digit number, we don't count those!");
                continue;
            }
            int x = Integer.parseInt(splitInput[i]);
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
