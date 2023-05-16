package io.codelex.classesandobjects.practice.Product;

import java.sql.SQLOutput;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.priceAtStart = price;
        this.amountAtStart = amount;
    }

    public void printProduct() {
        System.out.printf("%s, price %.2f, amount %d\n", name, priceAtStart, amountAtStart);
    }

    public void changeQuantity(int newAmount) {
        amountAtStart = newAmount;
    }

    public void changePrice(double newPrice) {
        priceAtStart = newPrice;
    }

}
