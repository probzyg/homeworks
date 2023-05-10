package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        int rows = 4;
        int maxRows = 0;

        if (rows < 4) {
            maxRows = (rows - 2) * 2;
        } else if (rows == 4) {
            maxRows = rows;
        } else if (rows > 4) {
            maxRows = rows + (rows - 4);
        }

        int maxSlashes = rows * 2 - maxRows;
        int slashes = rows * 4 - maxSlashes;
        int stars = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < slashes; j++) {
                System.out.print("/");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < slashes; j++) {
                System.out.print("\\");
            }
            System.out.println();

            slashes -= 4;
            stars += 8;
        }
    }
}