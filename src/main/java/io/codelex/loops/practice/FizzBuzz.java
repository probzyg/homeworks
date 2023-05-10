package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Max value? ");
        int maxValue = input.nextInt();

        for (int number = 1; number <= maxValue; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (number % 3 == 0) {
                System.out.print("Fizz ");
            } else if (number % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.printf("%d ", number);
            }
            if (number % 20 == 0) {
                System.out.println();
            }
        }
    }
}
