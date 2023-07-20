package io.codelex.oop.shapes;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @FunctionalInterface
    public interface Printer{
        void print(Shape shape);
    }

    public static void printInfo(Shape shape) {
        System.out.println("Number of sides: " + shape.getNumSides());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }

}
