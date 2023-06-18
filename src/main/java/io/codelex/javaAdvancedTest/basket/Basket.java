package io.codelex.javaAdvancedTest.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket <T>{
    private int currentItems;
    private List<T> items = new ArrayList<>();

    public void addToBasket(T item) throws BasketFullException {
        if (currentItems >= 10) {
            throw new BasketFullException("Basket is full");
        }
        items.add(item);
        currentItems++;
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (currentItems <= 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        items.remove(item);
        currentItems--;
    }

    public int getCurrentItems() {
        return currentItems;
    }
}
