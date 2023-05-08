package io.codelex.typesandvariables.practice;

public class MinuteConverter {
    public static void main(String[] args) {
        long minutes = 556200;
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        float minutesInDay = 60 * 24,
                days = (float) remainingMinutes / minutesInDay;

        System.out.printf("%d minutes is %d years and %.2f days.", minutes, years, days);
    }
}
