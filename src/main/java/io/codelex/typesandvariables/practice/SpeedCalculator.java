package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input distance in meters: ");
        float distanceInMeters = scanner.nextFloat();
        System.out.printf("Input hours: ");
        float hours = scanner.nextFloat();
        System.out.printf("Input minutes: ");
        float minutes = scanner.nextFloat();
        System.out.printf("Input seconds: ");
        float seconds = scanner.nextFloat();

        float allSeconds = seconds + (minutes * 60) + (hours * 3600);
        float allHours = hours + (minutes / 60) + (seconds / 3600);
        float speedMS = distanceInMeters / allSeconds;
        float speedKmH = (distanceInMeters / 1000) / allHours;
        float speedMH = (distanceInMeters / 1609) / allHours;

        System.out.println("Calculated speed: ");
        System.out.println("Your speed in meters/second is " + speedMS);
        System.out.println("Your speed in kilometers/h is " + speedKmH);
        System.out.println("Your speed in miles/h is " + speedMH);
    }
}
