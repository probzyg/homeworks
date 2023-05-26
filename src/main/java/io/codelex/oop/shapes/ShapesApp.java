package io.codelex.oop.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        Triangle triangle = new Triangle(3,4);

        Shape.Printer printerLambda = shape -> Shape.printInfo(shape);
        Shape.Printer printerMethodReference = Shape::printInfo;

        printerLambda.print(rectangle);
        printerMethodReference.print(triangle);
    }
}
