package io.codelex.oop.Shape;

import java.lang.Math;
public class Cone extends Shape3D{
    private final double PI = Math.PI;
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return ((PI * Math.pow(radius, 2)) + (PI * radius * (Math.sqrt(Math.pow(radius, 2)+ (Math.pow(height, 2))))));
    }

    @Override
    double calculateVolume() {
        return (PI * Math.pow(radius, 2) * height) / 3;
    }
}
