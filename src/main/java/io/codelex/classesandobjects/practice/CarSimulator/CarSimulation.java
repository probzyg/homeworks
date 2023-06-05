package io.codelex.classesandobjects.practice.CarSimulator;


public class CarSimulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
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


