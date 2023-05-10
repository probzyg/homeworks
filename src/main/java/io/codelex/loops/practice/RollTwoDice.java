package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Random diceNum = new Random();
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Desired sum: ");
        int desiredSum = input.nextInt();

        while (sum != desiredSum) {
            int dice1Number = (1 + diceNum.nextInt(6));
            int dice2Number = (1 + diceNum.nextInt(6));
            sum = dice1Number + dice2Number;
            System.out.printf("%d and %d = %d\n", dice1Number, dice2Number, sum);
        }
    }
}
