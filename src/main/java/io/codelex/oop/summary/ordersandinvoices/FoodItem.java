package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem{
    private LocalDate dateOfExpiration;

    public FoodItem(String name, double price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + getPrice() + " EUR, best before: " + dateOfExpiration;
    }
}
