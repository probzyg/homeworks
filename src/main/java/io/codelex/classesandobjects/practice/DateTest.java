package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(10, 5, 1999);
        date.displayDate();

        date.setMonth(9);
        date.setDay(1);
        date.setYear(2023);

        date.displayDate();
    }
}
