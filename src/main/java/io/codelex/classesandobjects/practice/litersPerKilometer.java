package io.codelex.classesandobjects.practice;

import java.util.Scanner;

class Car {
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

public class litersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        int endKilometers;
        double liters;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter first reading: ");
            startKilometers = scan.nextDouble();

            System.out.print("Enter second reading: ");
            endKilometers = scan.nextInt();

            System.out.print("Enter liters consumed: ");
            liters = scan.nextDouble();

            Car car = new Car(startKilometers);
            car.fillUp(endKilometers, liters);

            System.out.printf("Kilometers per liter are %.2f\n", car.calculateConsumption());

            if (car.gasHog()) {
                System.out.println(("Your car is a gas hog!"));
            } else if (car.economyCar()) {
                System.out.println("Your car is an economy car!");
            }
        }
    }
}

