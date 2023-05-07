package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        return Math.PI * (Math.pow(radius.doubleValue(), 2));
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.doubleValue() * width.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.doubleValue() * h.doubleValue() * 0.5;
    }
}
