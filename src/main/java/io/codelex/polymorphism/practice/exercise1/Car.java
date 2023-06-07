package io.codelex.polymorphism.practice.exercise1;

public interface Car {
    Integer currentSpeed = 0;

    public void speedUp();
    public void slowDown();
    default String showCurrentSpeed() {
        return currentSpeed.toString();
    }
    public void startEngine();

}

