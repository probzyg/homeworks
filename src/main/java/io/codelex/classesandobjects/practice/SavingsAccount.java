package io.codelex.classesandobjects.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingsAccount {
    private static double rate;
    private static double balance;

    public SavingsAccount(double startBalance) {
        this.balance += startBalance;
    }

    public double withdrawal(int withdrawal) {
        return (balance -= withdrawal);
    }

    public double deposit(int deposit) {
        return (balance += deposit);
    }

    public double addInterest() {
        return (balance += (balance * (rate / 100 / 12)));
    }

    public double calcInterest() {
        return (balance * (rate / 100 / 12));
    }


    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(balance);
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("$#,###.00");
        int months;
        int deposit;
        int depositSum = 0;
        int withdrawal;
        int withdrawalSum = 0;
        double interest;
        double interestSum = 0;

        System.out.print("How much money is in the account?: ");
        balance += input.nextInt();
        System.out.print("Enter the annual interest rate: ");
        rate = input.nextInt();
        System.out.print("How long has the account been opened? ");
        months = input.nextInt();

        for (int i = 0; i < months; i++) {
            System.out.print("Enter amount deposited for month: " + (i + 1) + ": ");
            deposit = input.nextInt();
            savingsAccount.deposit(deposit);
            depositSum += deposit;
            System.out.print("Enter amount withdrawn for " + (i + 1) + ": ");
            withdrawal = input.nextInt();
            savingsAccount.withdrawal(withdrawal);
            withdrawalSum += withdrawal;
            interestSum += savingsAccount.calcInterest();
            System.out.println(savingsAccount.addInterest());
        }

        String formattedDepositSum = decimalFormat.format(depositSum);
        String formattedWithdrawalSum = decimalFormat.format(withdrawalSum);
        String formattedInterestSum = decimalFormat.format(interestSum);
        String formattedBalance = decimalFormat.format(balance);

        System.out.println("Total deposited: " + formattedDepositSum);
        System.out.println("Total withdrawn: " + formattedWithdrawalSum);
        System.out.println("Interest earned: " + formattedInterestSum);
        System.out.println("Ending balance: " + formattedBalance);

    }
}
