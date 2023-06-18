package io.codelex.javaAdvancedTest.bankCards;

import java.math.BigDecimal;

public abstract class Card {
    private String cardNumber;
    private String ownerFullName;
    private String CCV;
    private BigDecimal balance;

    public Card(String cardNumber, String ownerFullName, String CCV, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.ownerFullName = ownerFullName;
        this.CCV = CCV;
        this.balance = balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
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

    public abstract void takeMoney(BigDecimal amount) throws NotEnoughFundsException;
    public abstract void addMoney(BigDecimal amount);
}
