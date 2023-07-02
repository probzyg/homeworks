package io.codelex.polymorphism.practice.exercise6.animal;

import io.codelex.polymorphism.practice.exercise6.food.Food;
import io.codelex.polymorphism.practice.exercise6.food.Vegetable;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName,  double animalWeight, String livingRegion) {
        super(animalType,animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeek");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
