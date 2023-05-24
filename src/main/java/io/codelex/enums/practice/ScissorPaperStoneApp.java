package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ScissorPaperStoneApp {
    private static double winPC = 0;
    private static double winI = 0;
    public static void main(String[] args) {
        System.out.println("Let us begin...");
        boolean game = true;
        double trials = 0;

        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        while (game) {
            System.out.println("Scissor-Paper-Stone");

            ScissorPaperStone myTurn = null;
            ScissorPaperStone pcTurn = ScissorPaperStone.values()[random.nextInt(3)];
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String value = scanner.nextLine();
                switch (value) {
                    case "s" -> myTurn = ScissorPaperStone.SCISSOR;
                    case "p" -> myTurn = ScissorPaperStone.PAPER;
                    case "t" -> myTurn = ScissorPaperStone.STONE;
                    case "q" -> {
                        game = false;
                        double winPCPercent =  winPC / trials;
                        double winIPercent = winI / trials;
                        String formattedWinPCPercent = decimalFormat.format(winPCPercent);
                        String formattedWinIPercent = decimalFormat.format(winIPercent);

                        System.out.println();
                        System.out.println("Number of trials: " + trials);
                        System.out.printf("I won %.0f(%s). You won %.0f(%s).", winI, formattedWinIPercent, winPC, formattedWinPCPercent);
                        System.out.println();
                        System.out.println("Bye!");
                    }
                    default -> System.out.println("Invalid input, try again...");
                }

            if (myTurn != null) {
                System.out.println("My turn: " + myTurn);
                if (pcTurn == myTurn) {
                    System.out.println("Tie!");
                } else {
                    String winner = winner(myTurn, pcTurn);
                    System.out.println(winner);
                }
            }
            trials++;
            System.out.println();
        }
    }


    private static String winner(ScissorPaperStone player, ScissorPaperStone computer) {
        if (player == ScissorPaperStone.SCISSOR && computer == ScissorPaperStone.PAPER) {
            winI++;
            return "You won!";
        } else if (player == ScissorPaperStone.PAPER && computer == ScissorPaperStone.STONE) {
            winI++;
            return "You won!";
        } else if (player == ScissorPaperStone.STONE && computer == ScissorPaperStone.SCISSOR) {
            winI++;
            return "You won!";
        } else if (player == computer) {
            return "Tie!";
        } else {
            winPC++;
            return "I won!";
        }
    }
}
