package io.codelex.polymorphism.practice.exercise6.animal;

import io.codelex.polymorphism.practice.exercise6.food.Food;
import io.codelex.polymorphism.practice.exercise6.food.Vegetable;

public class Zebra extends Mammal{

    public Zebra( String animalType,String animalName, double animalWeight, String livingRegion) {
        super(animalType,animalName,  animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zsss");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(food.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }
}
