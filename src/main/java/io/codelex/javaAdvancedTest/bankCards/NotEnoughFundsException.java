package io.codelex.javaAdvancedTest.bankCards;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException(String message) {
        super(message);
    }
}
