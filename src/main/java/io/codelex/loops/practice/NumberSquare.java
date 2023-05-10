package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Min? ");
        int min = input.nextInt();
        System.out.print("Max? ");
        int max = input.nextInt();
        int range = max - min + 1;

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                System.out.print(min + (i + j) % range);
            }
            System.out.println();
        }

    }
}
