package io.codelex.javaAdvancedTest.bankCards;

import java.math.BigDecimal;

public class CreditCard extends Card{
    public CreditCard(String cardNumber, String ownerFullName, String CCV, BigDecimal balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Not enough funds on the credit card");
        }
        if (getBalance().subtract(amount).compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
        setBalance(getBalance().subtract(amount));
    }

    @Override
    public void addMoney(BigDecimal amount) {
        setBalance(getBalance().add(amount));
    }
}
