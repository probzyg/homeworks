package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        System.out.println(max); //just to check the work of override

        max = new Dog("Max", "male", "Lady", "Rocky");
        coco = new Dog("Coco", "female", "Molly", "Buster");
        rocky = new Dog("Rocky", "male", "Molly", "Sam");
        buster = new Dog("Buster", "male", "Lady", "Sparky");

        Dog referenceToMax = max;
        Dog referenceToRocky = rocky;
        Dog referenceToSparky = sparky;
        Dog referenceToBuster = buster;
        Dog referenceToSam = sam;
        Dog referenceToLady = lady;
        Dog referenceToMolly = molly;
        Dog referenceToCoco = coco;

        System.out.println(referenceToCoco.fathersName());
        System.out.println(referenceToSparky.fathersName());

        System.out.println(referenceToCoco.hasSameMotherAs(referenceToRocky));
    }
}