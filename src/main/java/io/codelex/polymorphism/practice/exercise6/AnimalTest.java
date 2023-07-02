package io.codelex.polymorphism.practice.exercise6;

import io.codelex.polymorphism.practice.exercise6.animal.*;
import io.codelex.polymorphism.practice.exercise6.food.*;

import java.util.*;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();
        while (true) {
            if (input.equals("End")) {
                printAnimalInfo(animals);
                break;
            } else {
                String[] animalData = input.split(" ");
                String animalType = animalData[0];
                String animalName = animalData[1];
                double animalWeight = Double.parseDouble(animalData[2]);
                String animalLivingRegion = animalData[3];

                Mammal animal = createAnimal(animalType, animalName, animalWeight, animalLivingRegion, animalData);

                animal.makeSound();

                String foodType = scanner.nextLine();
                String[] foodData = foodType.split(" ");
                String foodName = foodData[0];
                int foodQuantity = Integer.parseInt(foodData[1]);

                Food food = createFood(foodName, foodQuantity);

                animal.setLivingRegion(animalLivingRegion);

                if (food != null) {
                    animal.eat(food);
                    animals.add(animal);
                }
                System.out.println(animal);

            }
                input = scanner.nextLine();
        }
    }
    private static Food createFood(String foodName, int foodQuantity) {
        if (foodName.equals("Meat")) {
            return new Meat(foodQuantity);
        } else if (foodName.equals("Vegetable")) {
            return new Vegetable(foodQuantity);
        } else {
            return null;
        }
    }

    private static void printAnimalInfo(List<Animal> animals) {
        String animalInfo = "";
        for (Animal animal : animals) {
            animalInfo += animal + ", ";
        }
        String result = animalInfo.substring(0, animalInfo.length() - 2);
        System.out.println(result);
    }

    private static Mammal createAnimal(String animalType, String animalName, double animalWeight, String animalLivingRegion, String[] animalData) {
        Mammal animal;
        switch (animalType) {
            case "Cat" -> {
                String catBreed = animalData[4];
                animal = new Cat(animalType, animalName, animalWeight, animalLivingRegion, catBreed);
            }
            case "Zebra" -> animal = new Zebra(animalType, animalName, animalWeight, animalLivingRegion);
            case "Mouse" -> animal = new Mouse(animalType, animalName, animalWeight, animalLivingRegion);
            case "Tiger" -> animal = new Tiger(animalType, animalName, animalWeight, animalLivingRegion);

            default -> animal = null;
        }
        return animal;
    }
}

