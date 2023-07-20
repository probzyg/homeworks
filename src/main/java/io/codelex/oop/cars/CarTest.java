package io.codelex.oop.cars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarTest {
    public static void main(String[] args) {
        CarService myService = new CarService();
        Manufacturer firstManufacturer = new Manufacturer("Manufacturer 1", 1930, "Germany");
        Manufacturer secondManufacturer = new Manufacturer("Manufacturer 2", 1960, "Japan");
        Manufacturer thirdManufacturer = new Manufacturer("Manufacturer3", 1950, "Russian Federation");

        Car car1 = new Car("Car1", "Model1", 30000, 2015, List.of(firstManufacturer), EngineType.V6);
        Car car2 = new Car("Car2", "Model2", 15000, 1990, Arrays.asList(secondManufacturer, firstManufacturer), EngineType.V8);
        Car car3 = new Car("Car3", "Model3", 190000, 2021, Arrays.asList(firstManufacturer, secondManufacturer, thirdManufacturer), EngineType.V12);
        Car car4 = new Car("Car4", "Model4", 10000, 1980, List.of(secondManufacturer, thirdManufacturer), EngineType.V3);
        Car car5 = new Car("Car5", "Model1", 30000, 2011, List.of(firstManufacturer, secondManufacturer, thirdManufacturer), EngineType.V6);

        System.out.println("First part test:\n");
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1.equals(car5));
        System.out.println(car2.equals(car3) + "\n");

        System.out.println(firstManufacturer.equals(secondManufacturer) + "\n");

        System.out.println("Second part test:\n");

        myService.addCar(car1);
        myService.addCar(car2);
        myService.addCar(car3);
        myService.addCar(car4);
        myService.addCar(car5);

        System.out.println("All cars:");
        List<Car> allCars = myService.listOfCars();
        for (Car car : allCars) {
            List<String> manufacturerNames = car.getManufacturers().stream().map(Manufacturer::getName).toList();
            String manufacturerNamesString = manufacturerNames.toString().replaceAll("\\[|\\]", "");

            System.out.printf("Name: %s | Model: %s | Price: %.2f | Manufacturers: %s | Engine type: %s\n",
                    car.getName(), car.getModel(), car.getPrice(), manufacturerNamesString, car.getEngineType());
        }
        System.out.println();

        System.out.println("Cars with V12 Engine:");
        List<Car> carsWithV12Engine = myService.carsWithV12Engine();
        for (Car car : carsWithV12Engine) {
            System.out.println(car.getName());
        }
        System.out.println();

        System.out.println("Cars produced before 1999:");
        List<Car> carsProducedBefore1999 = myService.getCarsProducedBefore1999();
        for (Car car : carsProducedBefore1999) {
            System.out.println(car.getName());
        }
        System.out.println();

        System.out.println("Most Expensive Car:");
        Car mostExpensiveCar = myService.mostExpensive();
        System.out.println(mostExpensiveCar.getName());
        System.out.println();

        System.out.println("Cheapest Car:");
        Car cheapestCar = myService.cheapest();
        System.out.println(cheapestCar.getName());
        System.out.println();

        System.out.println("Cars with at least 3 manufacturers:");
        List<Car> carsWithMultipleManufacturers = myService.tripleManufacturers();
        for (Car car : carsWithMultipleManufacturers) {
            System.out.println(car.getName());
        }
        System.out.println();

        System.out.println("Cars sorted by price:");
        List<Car> carsSortedByPrice = myService.sortedByPrice("Descending");
        for (Car car : carsSortedByPrice) {
            System.out.println(car.getName() + " - " + car.getPrice());
        }
        System.out.println();

        System.out.println("Is car4 on the list? " + myService.onList(car4));
        System.out.println();

        System.out.println("**Removing car4 from the list**\n");
        myService.removeCar(car4);

        System.out.println("Is car on the list? " + myService.onList(car4));
        System.out.println();

        System.out.println("**Adding car4 from the list**\n");
        myService.addCar(car4);

        System.out.println("Cars manufactured by Manufacturer3:");
        List<Car> carsByManufacturer = myService.getCarsByManufacturer(thirdManufacturer);
        for (Car car : carsByManufacturer) {
            System.out.println(car.getName());
        }
        System.out.println();

        System.out.println("Cars manufactured by Manufacturer1 year of establishment < 1990:");
        List<Car> carsByManufacturerWithYearComparison = myService.yearComparison(
                firstManufacturer, "<", 1990);
        for (Car car : carsByManufacturerWithYearComparison) {
            System.out.println(car.getName());
        }
    }
}