package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Nitrous{
    protected Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }


    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }


    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 24;
    }
}
