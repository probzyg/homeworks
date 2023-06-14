package io.codelex.javaAdvancedTest.bankCards;

public abstract class Card {
    private String cardNumber;
    private String ownerFullName;
    private String CCV;
    private double balance;

    public Card(String cardNumber, String ownerFullName, String CCV, double balance) {
        this.cardNumber = cardNumber;
        this.ownerFullName = ownerFullName;
        this.CCV = CCV;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public String getCCV() {
        return CCV;
    }

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;
    public abstract void addMoney(double amount);
}
