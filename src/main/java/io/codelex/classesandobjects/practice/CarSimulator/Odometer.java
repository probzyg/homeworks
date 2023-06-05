package io.codelex.classesandobjects.practice.CarSimulator;

public class Odometer {
    private int currentMileage;
    public final int maxMileage = 999999;

    public void setCurrentMileage() {
        this.currentMileage = 0;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileageWithFuel(FuelGauge fuelGauge) {
        if (currentMileage < maxMileage) {
            currentMileage += 10;
            if (currentMileage % 10 == 0) {
                fuelGauge.decreaseFuel();
            }
        } else {
            currentMileage = 0;
        }
    }
}
