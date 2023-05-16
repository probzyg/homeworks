package io.codelex.arrays.practice;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class KindOfHangman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = randomWord();
        int tries = word.length() + 3;
        String[] guessedLetters = new String[word.length()];
        String incorrectGuess = "";

        Arrays.fill(guessedLetters, "_");

        while (tries > 0) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: ");
            printWord(guessedLetters);
            System.out.println("Misses: " + incorrectGuess);
            System.out.print("Guess: ");
            char guess = input.next().charAt(0);
            boolean correct = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedLetters[i] = Character.toString(guess);
                    correct = true;
                }
            }

            if (!correct) {
                incorrectGuess += String.valueOf(guess);
            }

            if (Arrays.equals(guessedLetters, word.split(""))) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Word: " + Arrays.toString(guessedLetters).replaceAll("[,\\[\\]]", ""));
                System.out.println("Misses: " + incorrectGuess);
                System.out.println("YOU GOT IT!");
                break;
            }

            tries--;
        }

        if (tries == 0) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("You ran out of tries!");
        }

        System.out.println("Play \"again\" or \"quit\"?");
        String choice = input.next();

        if (choice.equalsIgnoreCase("again")) {
            main(args);
        }
    }

    public static String randomWord() {
        String[] words = {
                "police", "leviathan", "ship", "opportunity",
                "recommendation", "sewer", "accommodation",
                "shuttle", "server", "exercise", "management", "space",
                "doctor", "engineer", "dependencies", ""
        };

        Random random = new Random();
        int indexNum = random.nextInt(words.length);
        return words[indexNum];
    }

    public static void printWord(String[] arr) {
        for (String letter : arr) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}