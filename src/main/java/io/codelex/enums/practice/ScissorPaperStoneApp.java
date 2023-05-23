package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ScissorPaperStoneApp {
    public static void main(String[] args) {
        System.out.println("Let us begin...");
        boolean game = true;
        int trials = 0;
        int winPC = 0;
        int winI = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");


        while (game) {
            System.out.println("Scissor-Paper-Stone");
            Random random = new Random();
            int randomOrdinal = random.nextInt(3);

            Scanner scanner = new Scanner(System.in);
            ScissorPaperStone turn = null;
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String value = scanner.nextLine();

                switch (value) {
                    case "s" -> turn = ScissorPaperStone.SCISSOR;
                    case "p" -> turn = ScissorPaperStone.PAPER;
                    case "t" -> turn = ScissorPaperStone.STONE;
                    case "q" -> {
                        game = false;
                        double winPCPercent = (double) winPC / (double) trials;
                        double winIPercent = (double) winI / (double) trials;
                        String formattedWinPCPercent = decimalFormat.format(winPCPercent);
                        String formattedWinIPercent = decimalFormat.format(winIPercent);

                        System.out.println();
                        System.out.println("Number of trials: " + trials);
                        System.out.printf("I won %d(%s). You won %d(%s).", winI, formattedWinIPercent, winPC, formattedWinPCPercent);
                        System.out.println();
                        System.out.println("Bye!");
                    }
                    default -> System.out.println("Invalid input, try again...");
                }

            if (turn != null) {
                System.out.println("My turn: " + turn);
            }


            if (randomOrdinal == 0 && value.equals("s")) {
                System.out.println("Tie!");
            }
            if (randomOrdinal == 1 && value.equals("p")) {
                System.out.println("Tie!");
            }
            if (randomOrdinal == 2 && value.equals("t")) {
                System.out.println("Tie!");
            }


            if (randomOrdinal == 0 && value.equals("p")) {
                System.out.println("You won!");
                winPC++;
            }
            if (randomOrdinal == 1 && value.equals("t")) {
                System.out.println("You won!");
                winPC++;
            }
            if (randomOrdinal == 2 && value.equals("s")) {
                System.out.println("You won!");
                winPC++;
            }


            if (randomOrdinal == 0 && value.equals("t")) {
                System.out.println("Stone breaks scissor, I won!");
                winI++;
            }
            if (randomOrdinal == 1 && value.equals("s")) {
                System.out.println("Scissor cuts paper, I won!");
                winI++;
            }
            if (randomOrdinal == 2 && value.equals("p")) {
                System.out.println("Paper wraps stone, I won!");
                winI++;
            }

            trials++;
            System.out.println();
        }
    }
}
