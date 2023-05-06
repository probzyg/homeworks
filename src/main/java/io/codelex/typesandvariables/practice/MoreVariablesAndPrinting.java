package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, height, weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        weight = 180; // lbs
        double heightInCentimeters = height * 2.54; // centimetres
        double weightInKilos = weight * 0.453592; // kilos
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " inches tall. That's "
                + String.format("%.2f", heightInCentimeters) + " centimeters tall.");
        System.out.println("He's " + weight + " pounds heavy. That's "
                + String.format("%.2f", weightInKilos) + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes.toLowerCase() + " eyes and " + hair.toLowerCase() + " hair.");
        System.out.println("His teeth are usually " + teeth.toLowerCase() + " depending on the coffee.");

        System.out.printf("If I add %d, %d, and %d I get %d.\n",
                age,
                height,
                weight,
                age + height + weight);
        // using height in inches and weight in pounds

        System.out.printf("If I add %d, %.2f, and %.2f I get %.2f.",
                age,
                heightInCentimeters,
                weightInKilos,
                age + heightInCentimeters + weightInKilos);
        // using height in centimeters and weight in kilos
    }
}