package io.codelex.oop.summary.ordersandinvoices;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<SellableThing> items;
    private int invoiceNumber;
    private InvoiceStatus status;
    private double priceWithoutVAT;
    private double priceWithVAT;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        if (order.getListOfItems().isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice with an empty order.");
        }
        this.items = new ArrayList<>(order.getListOfItems());
        this.invoiceNumber = Integer.parseInt(invoiceNumber);
        this.status = InvoiceStatus.APPROVED;
        this.priceWithVAT = calculateTotal();
        this.priceWithoutVAT = calculateWithoutVAT();
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    private double calculateWithoutVAT() {
        return items.stream().mapToDouble(SellableThing::getPrice).sum();
    }
    private double calculateVAT() {
        return (calculateWithoutVAT() * 0.21);
    }


    private double calculateTotal() {
        return (calculateWithoutVAT() + calculateVAT());
    }

    public String formattedInvoice() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================================\n");
        sb.append(String.format("= INVOICE NUMBER: %s%n", invoiceNumber));
        sb.append(String.format("= STATUS: %s%n", status));

        int itemNumber = 1;
        for (SellableThing item : items) {
            sb.append(String.format("= %d. %s%n", itemNumber, item.fullInfo()));
            itemNumber++;
        }

        sb.append(String.format("= SUM: %.2f EUR%n", priceWithoutVAT));
        sb.append(String.format("= VAT (21%%): %.2f EUR%n", calculateVAT()));
        sb.append(String.format("= TOTAL: %.2f EUR%n", priceWithVAT));
        sb.append("===================================================\n");

        return sb.toString();
    }
    class WrongOrderException extends Throwable {
        public WrongOrderException(String s) {
            super(s);
        }
    }
}

