package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    final double PURCHASED_ENERGY_DRINKS = 0.14;
    final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        EnergyDrinks energyDrinks = new EnergyDrinks();

        int energyDrinkers = (int) energyDrinks.calculateEnergyDrinkers(NUMBERED_SURVEYED);
        int preferCitrus = (int) energyDrinks.calculatePreferCitrus(NUMBERED_SURVEYED);
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }


    private double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    private double calculatePreferCitrus(int numberSurveyed) {
        return calculateEnergyDrinkers(numberSurveyed) * PREFER_CITRUS_DRINKS;
    }

}

