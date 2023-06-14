package io.codelex.javaAdvancedTest.basket;

public class Basket <T>{
    private int currentItems;

    public void addToBasket(T item) throws BasketFullException {
        if (currentItems >= 10) {
            throw new BasketFullException("Basket is full");
        }
        currentItems++;
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (currentItems <= 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        currentItems--;
    }

    public int getCurrentItems() {
        return currentItems;
    }
}
