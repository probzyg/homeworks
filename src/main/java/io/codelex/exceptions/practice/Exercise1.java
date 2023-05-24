package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            String inputNumerator = scanner.nextLine();

            if (inputNumerator.toLowerCase().startsWith("q")) {
                break;
            }

            if (isInteger(inputNumerator)) {
                int numerator = Integer.parseInt(inputNumerator);

                if (numerator != 0) {
                    System.out.print("Enter the divisor: ");
                    String inputDivisor = scanner.nextLine();

                    if (isInteger(inputDivisor)) {
                        int divisor = Integer.parseInt(inputDivisor);

                        if (divisor != 0) {
                            System.out.println(numerator + " / " + divisor + " is " + numerator / divisor);
                            System.out.println();
                        } else if (divisor == 0) {
                            System.out.println("You can't divide " + numerator + " by 0");
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("You entered bad data.");
                        System.out.println("Please try again.");
                        System.out.println();
                    }
                }
            } else {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println();
            }
        }
    }

        private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
