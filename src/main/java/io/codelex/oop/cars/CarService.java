package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> listOfCars(){
        return new ArrayList<>(cars);
    }

    public List<Car> carsWithV12Engine() {
        return cars.stream().filter(car -> car.getEngineType() == EngineType.V12).toList();
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream().filter(car -> car.getYearOfManufacture() < 1999).toList();
    }

    public Car mostExpensive() {
        return cars.stream().max(Comparator.comparingDouble(Car::getPrice)).orElse(null);
    }

    public Car cheapest() {
        return cars.stream().min(Comparator.comparingDouble(Car::getPrice)).orElse(null);
    }

    public List<Car> tripleManufacturers() {
        return cars.stream().filter(car -> car.getManufacturers().size() >= 3).toList();
    }

    public List<Car> sortedByPrice(String input) {
        Comparator<Car> priceCompare = Comparator.comparingDouble(Car::getPrice);
        if (input.equals("Descending")) {
            priceCompare = priceCompare.reversed();
        }
        return cars.stream().sorted(priceCompare).toList();
    }

    public boolean onList(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            List<Manufacturer> manufacturers = car.getManufacturers();
            for (Manufacturer m : manufacturers) {
                if (m.equals(manufacturer)) {
                    result.add(car);
                    break;
                }
            }
        }
        return result;
    }

    public List<Car> yearComparison(Manufacturer manufacturer, String operator, int year) {
       return cars.stream().filter(car -> performYearComparison(car, manufacturer, operator, year)).toList();
    }

    public boolean performYearComparison(Car car, Manufacturer manufacturer, String operator, int year) {
        int manufacturerYear = manufacturer.getYearOfEstablishment();
        return switch (operator) {
            case "<" -> car.getManufacturers().contains(manufacturer) && manufacturerYear < year;
            case ">" -> car.getManufacturers().contains(manufacturer) && manufacturerYear > year;
            case "<=" -> car.getManufacturers().contains(manufacturer) && manufacturerYear <= year;
            case ">=" -> car.getManufacturers().contains(manufacturer) && manufacturerYear >= year;
            case "=" -> car.getManufacturers().contains(manufacturer) && manufacturerYear == year;
            case "!=" -> car.getManufacturers().contains(manufacturer) && manufacturerYear != year;
            default -> false;
        };
    }
}
