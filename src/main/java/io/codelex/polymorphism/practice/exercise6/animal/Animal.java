package io.codelex.polymorphism.practice.exercise6.animal;

import io.codelex.polymorphism.practice.exercise6.food.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    String animalName;
    String animalType;
    double animalWeight;
    int foodEaten;

    public Animal( String animalType, String animalName, double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public void eat(Food food){};

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s]", getAnimalType(), getAnimalName(),
                decimalFormat.format(getAnimalWeight()), getFoodEaten());
    }


}
