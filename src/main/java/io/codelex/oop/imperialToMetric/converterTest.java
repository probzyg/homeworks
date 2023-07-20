package io.codelex.oop.imperialToMetric;

import java.util.Scanner;

public class converterTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Value to convert: ");
        int value = in.nextInt();

        for (ConversionType conversionType : ConversionType.values()) {
            double result = MeasurementConverter.convert(value, conversionType);
            System.out.println(conversionType + ":" + value + " = " + result);
        }
    }
}
