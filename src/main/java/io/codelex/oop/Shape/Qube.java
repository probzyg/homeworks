package io.codelex.oop.Shape;


public class Qube extends Shape3D{
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}
