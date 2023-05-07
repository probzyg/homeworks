package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int randomNumber = (1 + randomNum.nextInt(100));
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");

        Scanner guess = new Scanner(System.in);
        int guessInt = guess.nextInt();

        if (guessInt == randomNumber) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (guessInt > randomNumber) {
            System.out.printf("Sorry, you are too high.  I was thinking of %d.", randomNumber);
        } else if (guessInt < randomNumber) {
            System.out.printf("Sorry, you are too low.  I was thinking of %d.", randomNumber);
        }
    }
}
