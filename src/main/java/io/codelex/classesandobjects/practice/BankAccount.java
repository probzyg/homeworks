package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {
    public static String name;
    public static double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        BankAccount.balance = balance;
    }

    public final void deposit(double amount) {
        balance = balance + amount;
    }

    public final void withdraw(double amount) {
        balance = balance - amount;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("$#,###.00");
        String formattedBalance = decimalFormat.format(BankAccount.balance);
        return name + ", " + formattedBalance;
    }

    public static void main(String[] args) {
        String output;
        BankAccount benben = new BankAccount("Benson", 17.25);
        output = benben.toString();
        System.out.println(output);
    }
}
