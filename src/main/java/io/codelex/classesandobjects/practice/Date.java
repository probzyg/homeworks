package io.codelex.classesandobjects.practice;

public class Date {
    private static int day;
    private static int month;
    private static int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void displayDate() {
        System.out.printf("%d/%d/%d\n", Date.month, day, year);
    }
}
