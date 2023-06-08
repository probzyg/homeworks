package io.codelex.polymorphism.practice.exercise6.animal;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super( animalType,animalName, animalWeight);
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s]", getAnimalType(), getAnimalName(),
                decimalFormat.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
