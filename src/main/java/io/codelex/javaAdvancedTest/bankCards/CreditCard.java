package io.codelex.javaAdvancedTest.bankCards;

public class CreditCard extends Card{
    private double refreshedBalance;
    public CreditCard(String cardNumber, String ownerFullName, String CCV, double balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        refreshedBalance = getBalance() - amount;
        if (refreshedBalance < 0) {
            throw new NotEnoughFundsException("Not enough funds on the credit card");
        }
        if (refreshedBalance < 100) {
            System.out.println("Warning: Low funds");
        }
        setBalance(refreshedBalance);
    }

    @Override
    public void addMoney(double amount) {
        refreshedBalance = getBalance() + amount;
        setBalance(refreshedBalance);
    }
}
