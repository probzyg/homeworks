package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(1.0936133),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_ICHES(0.39370079),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.62137119),
    MILES_TO_KILOMETERS(1.609344);

    final double conversionRate;

    ConversionType (double rate) {
        this.conversionRate = rate;
    }
}
