package io.codelex.arithmetic.practice;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = 2835;
        int oddOrEven = number % 2;
        switch (oddOrEven) {
            case 0 -> System.out.println("Even number!");
            case 1 -> System.out.println("Odd number!");
        }
        System.out.println("bye");
    }
}
