package io.codelex.polymorphism.practice.exercise6.animal;

import io.codelex.polymorphism.practice.exercise6.food.Food;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalType,String animalName, double animalWeight, String livingRegion, String breed) {
        super("Cat",animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %s]",
                getAnimalType(), getAnimalName(), breed, decimalFormat.format(getAnimalWeight()),
                getLivingRegion() != null ? getLivingRegion() : "Unknown", getFoodEaten());
    }
}
