package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        VolksWagen volksWagen = new VolksWagen();
        Volvo volvo = new Volvo();
        List<Car> cars = new ArrayList<>();

        cars.add(audi);
        cars.add(bmw);
        cars.add(lexus);
        cars.add(tesla);
        cars.add(volksWagen);
        cars.add(volvo);

        for (int i = 0; i< 10; i++) {
            for (Car car : cars) {
                car.speedUp();
                if (i == 2 && car instanceof Nitrous nitrous) {
                    nitrous.useNitrousOxideEngine();
                }
            }
        }

        Car fastest = null;
        int maxSpeed = 0;
        for (Car car : cars) {
            int speed = Integer.parseInt(car.showCurrentSpeed());
            if (speed > maxSpeed) {
                maxSpeed = speed;
                fastest = car;
            }
        }


        assert fastest != null;
        System.out.println("Fastest car: " + fastest.getClass().getSimpleName());
        System.out.println("Speed: "  + maxSpeed);

    }
}
