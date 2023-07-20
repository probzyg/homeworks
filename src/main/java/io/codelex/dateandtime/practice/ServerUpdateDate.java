package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerUpdateDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter europeanFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter server launch date:");
        LocalDate launchDate = LocalDate.parse(in.nextLine(), europeanFormat);

        System.out.println("Enter year you want to check:");
        int year = in.nextInt();

        System.out.println("Enter month you want to check in year " + year + ":");
        int monthValue = in.nextInt();

        List<LocalDate> updateDates = calculateUpdateDates(launchDate, year, monthValue);

        Month month = Month.of(monthValue);
        String monthName = month.toString().substring(0, 1).toUpperCase() + month.toString().substring(1).toLowerCase();

        System.out.printf("Server update dates in %s %d:\n", monthName, year);
        for (LocalDate date : updateDates) {
            String formattedDate = date.format(europeanFormat);
            System.out.println(formattedDate);
        }
    }

    public static List<LocalDate> calculateUpdateDates(LocalDate launch, int year, int month) {
        List<LocalDate> updateDates = new ArrayList<>();
        LocalDate update = launch;

        while (update.getYear() < year || update.getYear() == year && update.getMonthValue() != month) {
            update = update.plusDays(14);
        }

        while (update.getYear() == year && update.getMonthValue() == month) {
            updateDates.add(update);
            update = update.plusDays(14);
        }
        return updateDates;
    }
}
