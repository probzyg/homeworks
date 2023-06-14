package io.codelex.javaAdvancedTest.bankCards;

public class DebitCard extends Card{
    private double refreshedBalance;
    public DebitCard(String cardNumber, String ownerFullName, String CCV, double balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        refreshedBalance = getBalance() - amount;
        if (refreshedBalance < 0) {
            throw new NotEnoughFundsException("Not enough funds on the debit card");
        }
        setBalance(refreshedBalance);
    }

    @Override
    public void addMoney(double amount) {
        refreshedBalance = getBalance() + amount;
        if (refreshedBalance > 10000) {
            System.out.println("Warning: Too much money");
        }
        setBalance(refreshedBalance);
    }
}
