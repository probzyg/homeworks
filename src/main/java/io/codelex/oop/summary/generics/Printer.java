package io.codelex.oop.summary.generics;


public class Printer {
    private final Object thingToPrint;

    public Printer(Object thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public Object getThingToPrint() {
        return thingToPrint;
    }
}
