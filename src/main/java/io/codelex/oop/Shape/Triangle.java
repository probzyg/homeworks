package io.codelex.oop.Shape;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double calculatePerimeter() {
        double hypotenuse = Math.hypot(base, height);
        return base + height + hypotenuse;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
