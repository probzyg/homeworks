package io.codelex.oop.summary.ordersandinvoices;

public class ItemPacking implements Service{
    private static final String name = "Item packing";
    private static final double price = 5.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR", getName(), getPrice());
    }
}
