package io.codelex.oop.summary.ordersandinvoices;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<SellableThing> items;
    private int invoiceNumber;
    private InvoiceStatus status;
    private double priceWithoutVAT;
    private double priceWithVAT;
    private final int width = 60;

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

        sb.append("=".repeat(width)).append("\n");

        sb.append(format("INVOICE NUMBER: ", String.valueOf(invoiceNumber)));

        sb.append(format("STATUS: ", String.valueOf(status)));

        int itemNumber = 1;
        for (SellableThing item : items) {
                    sb.append(format(String.valueOf(itemNumber) + ". ", item.fullInfo()));
            itemNumber++;
        }

        sb.append(format("SUM: ", String.format("%.2f EUR", priceWithoutVAT)));
        sb.append(format("VAT (21%): ", String.format("%.2f EUR", calculateVAT())));
        sb.append(format("TOTAL: ", String.format("%.2f EUR", priceWithoutVAT)));
        sb.append("=".repeat(width)).append("\n");

        return sb.toString();
    }
    static class WrongOrderException extends Throwable {
        public WrongOrderException(String s) {
            super(s);
        }
    }

    private String format(String text, String value) {
        return "= " + text + value + " ".repeat(width - text.length() - value.length() - 3) + "=\n";
    }
}


