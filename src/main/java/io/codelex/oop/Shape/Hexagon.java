package io.codelex.oop.Shape;


public class Hexagon extends Shape{
    //regular hexagon
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return side*6;
    }

    @Override
    double calculateArea() {
        return ((3 * Math.sqrt(3) * (Math.pow(side, 2))) / 2);
    }
}
