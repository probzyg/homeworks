package io.codelex.classesandobjects.practice.CarSimulator;

public class FuelGauge {
    private int currentFuel;
    public final int maxFuel = 70;

    public FuelGauge() {
        currentFuel = 0;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void increaseFuel() {
        if (currentFuel < maxFuel) {
            currentFuel++;
        }
    }

    public void decreaseFuel() {
        if (currentFuel > 0) {
            currentFuel--;
        }
    }
}
