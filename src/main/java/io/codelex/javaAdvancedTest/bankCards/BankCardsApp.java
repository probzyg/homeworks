package io.codelex.javaAdvancedTest.bankCards;

import java.math.BigDecimal;

public class BankCardsApp {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard cc = new CreditCard("1234567891234567", "John Lennon", "183", BigDecimal.valueOf(1234.56));
        DebitCard dc = new DebitCard("5573672008830244", "Janis Kaveckis", "164", BigDecimal.valueOf(2043.50));

        System.out.println("Credit card:");
        System.out.println(cc.getBalance());
        cc.addMoney(BigDecimal.valueOf(100));
        System.out.println(cc.getBalance());
        cc.takeMoney(BigDecimal.valueOf(1300));
        System.out.println(cc.getBalance());
        System.out.println();

        System.out.println("Debit card");
        System.out.println(dc.getBalance());
        dc.addMoney(BigDecimal.valueOf(8000));
        System.out.println(dc.getBalance());
        dc.takeMoney(BigDecimal.valueOf(100));
        System.out.println(dc.getBalance());
    }
}
