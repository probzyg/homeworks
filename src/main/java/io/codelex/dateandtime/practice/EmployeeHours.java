package io.codelex.dateandtime.practice;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;


public class EmployeeHours {
    private static List<LocalDate> nationalHolidays;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nationalHolidays();
        DateTimeFormatter europeanFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter date of start of the period (dd.mm.yyyy):");
        String startDateInput = in.nextLine();
        LocalDate startDate = LocalDate.parse(startDateInput, europeanFormat);
        System.out.println("Enter date of end of the period (dd.mm.yyyy):");
        String endDateInput = in.nextLine();
        LocalDate endDate = LocalDate.parse(endDateInput, europeanFormat);

        long workingHours = calculateWorkingHours(startDate, endDate);

        System.out.println("Total working hours: " + workingHours);
    }

    public static void nationalHolidays() {
        nationalHolidays = new ArrayList<>();
        nationalHolidays.add(LocalDate.of(2023, 1, 1));
        nationalHolidays.add(LocalDate.of(2023, 4, 7));
        nationalHolidays.add(LocalDate.of(2023, 4, 9));
        nationalHolidays.add(LocalDate.of(2023, 4, 10));
        nationalHolidays.add(LocalDate.of(2023, 5, 1));
        nationalHolidays.add(LocalDate.of(2023, 5, 4));
        nationalHolidays.add(LocalDate.of(2023, 5, 14));
        nationalHolidays.add(LocalDate.of(2023, 5, 28));
        nationalHolidays.add(LocalDate.of(2023, 6, 23));
        nationalHolidays.add(LocalDate.of(2023, 6, 24));
        nationalHolidays.add(LocalDate.of(2023, 7, 9));
        nationalHolidays.add(LocalDate.of(2023, 7, 10));
        nationalHolidays.add(LocalDate.of(2023, 11, 18));
        nationalHolidays.add(LocalDate.of(2023, 11, 20));
        nationalHolidays.add(LocalDate.of(2023, 12, 24));
        nationalHolidays.add(LocalDate.of(2023, 12, 25));
        nationalHolidays.add(LocalDate.of(2023, 12, 26));
        nationalHolidays.add(LocalDate.of(2023, 12, 31));

    }

    public static long calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        long workingHours = 0;

        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY && !nationalHolidays.contains(currentDate)) {
                workingHours += 8;
            }

            currentDate = currentDate.plusDays(1);
        }

        return workingHours;
    }
}
