package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your weight in kilos: ");
        double weight = input.nextDouble();
        System.out.print("Input your height in centimetres: ");
        double height = input.nextDouble();

        double weightInPounds = weight * 2.20462262, heightInInches = height * 0.39370079;
        double BMI = weightInPounds * 703 / (heightInInches * heightInInches);

        if (BMI >= 18.5 && BMI <= 25) {
            System.out.printf("Your BMI is %.2f, you have optimal weight!\n", BMI);
        } else if (BMI < 18.5) {
            System.out.printf("Your BMI is %.2f, you are considered underweight!\n", BMI);
        } else if (BMI > 25) {
            System.out.printf("Your BMI is %.2f, you are considered overweight!\n", BMI);
        }
    }
}
