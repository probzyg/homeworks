package io.codelex.loops.practice;

import java.util.Scanner;
import java.util.Random;

public class Piglet {
    public static void main(String[] args) {
        Random diceNum = new Random();
        Scanner input = new Scanner(System.in);
        int diceNumber = (1 + diceNum.nextInt(6));
        int score = 0;

        System.out.print("Welcome to Piglet!\n");
        String userChoice;
        while (diceNumber > 0) {
            if (diceNumber == 1) {
                System.out.println("Game over! You got 0 points.");
                break;
            } else if (diceNumber > 1) {
                System.out.printf("You rolled a %d!\n", diceNumber);
                score += diceNumber;
                System.out.print("Roll again? ");
                userChoice = input.nextLine();
                if (userChoice.equals("y")) {
                    diceNumber = (1 + diceNum.nextInt(6));
                } else if (userChoice.equals("n")) {
                    System.out.printf("Your score is %d!\n", score);
                    break;
                } else {
                    System.out.println("You can choose only between yes, writing y, and no, writing n, be careful my friend!");
                }
            }
        }
    }
}
