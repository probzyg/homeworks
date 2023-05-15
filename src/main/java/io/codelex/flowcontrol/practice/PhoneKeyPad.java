package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string you want to convert: ");
        String[] inputString = input.nextLine().toLowerCase().split("");
        for (String s : inputString) {
            switch (s) {
                case "a", "b", "c" -> System.out.print(2);
                case "d", "e", "f" -> System.out.print(3);
                case "g", "h", "i" -> System.out.print(4);
                case "j", "k", "l" -> System.out.print(5);
                case "m", "n", "o" -> System.out.print(6);
                case "p", "q", "r", "s" -> System.out.print(7);
                case "t", "u", "v" -> System.out.print(8);
                default -> System.out.print(9);
            }
        }

    }
}
