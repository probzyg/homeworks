package io.codelex.classesandobjects.practice;

class fuelGauge {
    private int currentFuel;
    public final int maxFuel = 70;

    public fuelGauge() {
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

class Odometer {
    private int currentMileage;
    public final int maxMileage = 999999;

    public void setCurrentMileage() {
        this.currentMileage = 0;
    }
 
    public int getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileageWithFuel(fuelGauge fuelGauge) {
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


public class carSimulation {
    public static void main(String[] args) {
        fuelGauge fuelGauge = new fuelGauge();
        Odometer odometer = new Odometer();

        while (fuelGauge.getCurrentFuel() < fuelGauge.maxFuel) {
            fuelGauge.increaseFuel();
        }

        for (int i = 0; i < 1; i++) {
            if (fuelGauge.getCurrentFuel() == fuelGauge.maxFuel) {
                while ((odometer.getCurrentMileage() + 10) < odometer.maxMileage) {
                    odometer.increaseMileageWithFuel(fuelGauge);
                    System.out.println("Current mileage: " + odometer.getCurrentMileage());
                    System.out.println("Current fuel: " + fuelGauge.getCurrentFuel());
                    if (fuelGauge.getCurrentFuel() == 0) {
                        System.out.println("Fuel up!");
                        while (fuelGauge.getCurrentFuel() < fuelGauge.maxFuel) {
                            fuelGauge.increaseFuel();
                        }
                    }
                }
            }
            if ((odometer.getCurrentMileage() + 10) > odometer.maxMileage) {
                odometer.setCurrentMileage();
                System.out.println("Current mileage: " + odometer.getCurrentMileage());
                System.out.println("Current fuel: " + fuelGauge.getCurrentFuel());
            }
        }
    }
}


