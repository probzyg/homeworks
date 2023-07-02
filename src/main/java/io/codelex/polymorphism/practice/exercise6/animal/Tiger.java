package io.codelex.polymorphism.practice.exercise6.animal;

import io.codelex.polymorphism.practice.exercise6.food.Food;
import io.codelex.polymorphism.practice.exercise6.food.Meat;

public class Tiger extends Felime{
    public String livingRegion;

    public Tiger( String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName,  animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setFoodEaten(food.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
