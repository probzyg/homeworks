package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        if (n >= -9999999999L && n <= 9999999999L) {
            //todo - check if n is less than zero
            if (n < 0) {
                n *= -1;
            }
            if (n >= 10000000000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits;
                if (n >= 1000000000L) {
                    digits = 10;
                } else if (n >= 100000000L) {
                    digits = 9;
                } else if (n >= 10000000L) {
                    digits = 8;
                } else if (n >= 1000000L) {
                    digits = 7;
                } else if (n >= 100000L) {
                    digits = 6;
                } else if (n >= 10000L) {
                    digits = 5;
                } else if (n >= 1000L) {
                    digits = 4;
                } else if (n >= 100L) {
                    digits = 3;
                } else if (n >= 10L) {
                    digits = 2;
                } else {
                    digits = 1;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }
    }

}
