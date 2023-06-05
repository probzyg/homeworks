package io.codelex.classesandobjects.practice.litersPerKilometer;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return (liters / (endKilometers - startKilometers)) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }
}
