package io.codelex.arithmetic.practice;

import io.codelex.polymorphism.practice.exercise4.Employee;

public class FooPaymentCalculator {
    public static void calculatePay(String employeeName, double basePay, int hours) {
        double totalPay;

        if (basePay < 8.00) {
            System.out.println("Error: Base pay is less than the minimum wage for " + employeeName + ".");
            return;
        }

        if (hours > 60) {
            System.out.println("Error: Hours worked exceeds the maximum limit for " + employeeName + ".");
            return;
        }
        if (hours <= 40) {
            totalPay = basePay * hours;
        } else {
            int overtime = hours - 40;
            totalPay = (basePay * 40) + (basePay * 1.5 * overtime);
        }

        System.out.println("Employee: " + employeeName + " | " + "Total Pay: $" + totalPay);
    }

    public static void main(String[] args) {
        calculatePay("Employee 1", 7.50, 35);
        calculatePay("Employee 2", 8.20, 47);
        calculatePay("Employee 3", 10.00, 73);
    }
}

