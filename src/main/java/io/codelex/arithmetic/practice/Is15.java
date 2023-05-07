package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Is15 {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static boolean test() {

        Scanner input = new Scanner(System.in);
        System.out.printf("Input first integer: ");
        int firstInteger = input.nextInt();
        System.out.printf("Input second integer: ");
        int secondInteger = input.nextInt();
        boolean result = false;
        
        if (firstInteger == 15 ||
                secondInteger == 15 ||
                firstInteger - secondInteger == 15 ||
                firstInteger + secondInteger == 15 ||
                secondInteger - firstInteger == 15)
            result = true;

        return result;
    }

}

