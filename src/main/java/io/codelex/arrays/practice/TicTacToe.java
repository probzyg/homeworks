package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static boolean winner = false;

    public static void main(String[] args) {
        System.out.println("Game has started!");
        initBoard();
        displayBoard();
        int i;
        for (i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.print("'O', choose your location (row, column): ");
                player1();
            } else {
                System.out.print("'X', choose your location (row, column): ");
                player2();
            }
            if (checkWin()) {
                winner = true;
                break;
            }
        }
        if (winner) {
            char winner = i
                    % 2 == 0 ? 'O' : 'X';
            System.out.println("Player '" + winner + "' wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void player1() {
        Scanner keyboard = new Scanner(System.in);
        int vertical = keyboard.nextInt();
        int horizontal = keyboard.nextInt();
        char input1 = 'O';
        if (board[vertical][horizontal] == ' ') {
            board[vertical][horizontal] = input1;
            displayBoard();
        } else {
            System.out.println("Try again! ");
            System.out.print("'O', choose your location (row, column): ");
            player1();
        }
    }

    public static void player2() {
        Scanner keyboard = new Scanner(System.in);
        int vertical = keyboard.nextInt();
        int horizontal = keyboard.nextInt();
        char input2 = 'X';
        if (board[vertical][horizontal] == ' ') {
            board[vertical][horizontal] = input2;
            displayBoard();
        } else {
            System.out.println("Try again! ");
            System.out.print("'X', choose your location (row, column): ");
            player2();
        }
    }

    public static boolean checkWin() {
        for (int r = 0; r < 3; r++) {
            if (board[r][0] != ' ' && board[r][0] == board[r][1] && board[r][1] == board[r][2]) {
                return true;
            }
        }
        for (int c = 0; c < 3; c++) {
            if (board[0][c] != ' ' && board[0][c] == board[1][c] && board[1][c] == board[2][c]) {
                return true;
            }
        }
        for (int d = 0; d < 3; d++) {
            if (board[0][d] != ' ' && board[0][d] == board[1][d] && board[1][d] == board[2][d]) {
                return true;
            }
        }
        return false;
    }
}
