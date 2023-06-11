package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws Invoice.WrongOrderException {
        Item milk = new FoodItem("Milk", 0.75, LocalDate.of(2023, 6, 25));
        Item radio = new ElectronicsItem("Radio", 25.00, 100);
        Item bucket = new HouseholdItem("Bucket", 5.00, "red");
        ItemPacking itemPacking = new ItemPacking();

        Order order = new Order();
        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);
        order.addItem(itemPacking);

        Invoice invoice = new Invoice(order, "123");

        System.out.println(invoice.formattedInvoice());
        System.out.println(order.getTextListOfItems());

        invoice.send();

        System.out.println(invoice.formattedInvoice());
    }
}
