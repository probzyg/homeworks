package io.codelex.enums.practice;

import java.sql.SQLOutput;

public class CardinalPointTable {
    public static void main(String[] args) {
        CardinalPoints point = null;
        //System.out.println(point.getDirection() + ":" + point.getWayToGo() + ":"+ point.ordinal());

        System.out.printf("| %s | %s | %s |\n","Direction", "Text", "Ordinal");
        System.out.println("| --- | --- | --- |");
        for (int i = 0; i <= 3 ; i++) {
            switch (i) {
                case 0 -> point = CardinalPoints.NORTH;
                case 1 -> point = CardinalPoints.SOUTH;
                case 2 -> point = CardinalPoints.EAST;
                case 3 -> point = CardinalPoints.WEST;
            }
            System.out.printf("| %s | %s | %d |\n", point.getDirection(), point.getWayToGo(), point.ordinal());
        }

        for (int j = 0; j <= 3 ; j++) {
            switch (j) {
                case 0 -> point = CardinalPoints.NORTH;
                case 1 -> point = CardinalPoints.SOUTH;
                case 2 -> point = CardinalPoints.EAST;
                case 3 -> point = CardinalPoints.WEST;
            }
            System.out.println(point.getDirection() + ":" + point.getWayToGo() + ":"+ point.ordinal());
        }
    }
}
