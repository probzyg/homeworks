package io.codelex.polymorphism.practice.exercise1;

public class VolksWagen implements Nitrous{
    protected Integer currentSpeed = 0;


    public void speedUp() {
        currentSpeed += 5;
    }


    public void slowDown() {
        currentSpeed -= 5;
    }


    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }


    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }


    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 15;
    }
}
