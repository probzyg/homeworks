package io.codelex.oop.Shape;

public class Rectangle extends Shape{
    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    double calculatePerimeter() {
        return (aSide + bSide) * 2;
    }

    @Override
    double calculateArea() {
        return (aSide * bSide);
    }
}
