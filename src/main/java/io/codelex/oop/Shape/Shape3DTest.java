package io.codelex.oop.Shape;

public class Shape3DTest {
    public static void main(String[] args) {
        Qube cube = new Qube(5);
        Cone cone = new Cone(5, 10);

        System.out.println("Cube:");
        System.out.println("Perimeter = " + cube.calculatePerimeter());
        System.out.println("Area = " + cube.calculateArea());
        System.out.println("Volume = " + cube.calculateVolume() + "\n");

        System.out.println("Cone:");
        System.out.println("Perimeter = " + cone.calculatePerimeter());
        System.out.println("Area = " + cone.calculateArea());
        System.out.println("Volume = " + cone.calculateVolume());
    }
}
