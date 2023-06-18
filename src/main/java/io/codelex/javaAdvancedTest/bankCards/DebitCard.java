package io.codelex.javaAdvancedTest.bankCards;

import java.math.BigDecimal;

public class DebitCard extends Card{
    public DebitCard(String cardNumber, String ownerFullName, String CCV, BigDecimal balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Not enough funds on the debit card");
        }
        setBalance(getBalance().subtract(amount));
    }

    @Override
    public void addMoney(BigDecimal amount) {
        if (getBalance().add(amount).compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
        setBalance(getBalance().add(amount));
    }
}
