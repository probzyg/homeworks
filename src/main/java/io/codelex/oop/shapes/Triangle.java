package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle( double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.hypot(width, height);
        return width + height + hypotenuse;
    }
}
