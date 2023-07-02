package io.codelex.polymorphism.practice.exercise5;

import java.math.BigDecimal;

public class Poster extends Advert{
    private int height;
    private int width;
    private int numberOfCopies;
    private double costPerCopy;

    public Poster(int fee, int height, int width, int numberOfCopies, double costPerCopy) {
        super(fee);
        this.height = height;
        this.width = width;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }


    public int cost() {
        return super.cost() + (int)((double)numberOfCopies * costPerCopy);
    }


    public String toString() {
        return super.toString() + " Poster: height: " + height + " width: " + width
                + " number of copies: " + numberOfCopies + "cost per copy: " + costPerCopy;
    }
}
