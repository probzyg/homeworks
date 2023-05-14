package io.codelex.classesandobjects.practice.Car;

import java.util.Scanner;

class LitersPerKilometer {
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
                System.out.println(("Your car is a gas hog!");
            } else if (car.economyCar()) {
                System.out.println("Your car is an economy car!");
            }
        }
    }
}