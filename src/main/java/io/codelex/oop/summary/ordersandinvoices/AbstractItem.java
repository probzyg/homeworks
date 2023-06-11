package io.codelex.oop.summary.ordersandinvoices;

public abstract class AbstractItem implements Item{
    private String name;
    private double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
