package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        if (item instanceof FoodItem foodItem) {
            LocalDate expirationDate = foodItem.getDateOfExpiration();
            LocalDate today = LocalDate.now();
            if (expirationDate.isBefore(today)) {
                throw new BadFoodException("Cannot add food item with expiration date in the past");
            }
        }
        items.add(item);
    }

    public List<SellableThing> getListOfItems() {
        return items;
    }
    public String getTextListOfItems() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            sb.append(items.get(i).getName());
            if (i < items.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    public class BadFoodException extends RuntimeException {
        public BadFoodException(String message) {
            super(message);
        }
    }

}
