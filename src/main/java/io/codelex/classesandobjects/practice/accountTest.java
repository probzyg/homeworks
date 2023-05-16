package io.codelex.classesandobjects.practice;

public class accountTest {
    public static void main(String[] args) {
        Account A = new Account("A", 100.00);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        int amount = 0;

        System.out.println("Created new account! Name: A");
        System.out.println("Created new account! Name: B");
        System.out.println("Created new account! Name: C");
        System.out.println();

        System.out.println("Initial state");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println();

        amount = 50;
        transfer(A, B, amount);
        amount = 25;
        transfer(B, C, amount);

        System.out.println("Final state");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
