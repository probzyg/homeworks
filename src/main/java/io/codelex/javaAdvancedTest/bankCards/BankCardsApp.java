package io.codelex.javaAdvancedTest.bankCards;

public class BankCardsApp {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard cc = new CreditCard("1234567891234567", "John Lennon", "183", 1234.56);
        DebitCard dc = new DebitCard("5573672008830244", "Janis Kaveckis", "164", 2043.50);

        System.out.println("Credit card:");
        System.out.println(cc.getBalance());
        cc.addMoney(100);
        System.out.println(cc.getBalance());
        cc.takeMoney(1300);
        System.out.println(cc.getBalance());
        System.out.println();

        System.out.println("Debit card");
        System.out.println(dc.getBalance());
        dc.addMoney(8000);
        System.out.println(dc.getBalance());
        dc.takeMoney(100);
        System.out.println(dc.getBalance());
    }
}
