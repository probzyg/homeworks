package io.codelex.oop.parcels;

public class Parcel implements Validatable{
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Sum of dimensions exceed 300!");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each dimension should be at least 30");
            return false;
        }
        if (weight > 30 && !isExpress) {
            System.out.println("Weight exceeds for standard");
            return false;
        }
        if (weight > 15 && isExpress) {
            System.out.println("Weight exceeds for express");
            return false;
        }
        else {
            System.out.println("Everything is ok!");
            return true;
        }
    }
}
