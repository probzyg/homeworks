package io.codelex.oop.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        Triangle triangle = new Triangle(6,8);
        Hexagon hexagon = new Hexagon(7);

        System.out.println("Rectangle:");
        System.out.println("Area = " + rectangle.calculateArea());
        System.out.println("Perimeter = " + rectangle.calculatePerimeter() + "\n");

        System.out.println("Triangle:");
        System.out.println("Area = " + triangle.calculateArea());
        System.out.println("Perimeter = " + triangle.calculatePerimeter()+ "\n");

        System.out.println("Hexagon:");
        System.out.println("Area = " + hexagon.calculateArea());
        System.out.println("Perimeter = " + hexagon.calculatePerimeter());
    }
}
