package io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer firstComputer = new Computer("Intel i5 11400", 16, "Nvidia GeForce GTX 3060", "ASUS", "ROG AG7286LE");
        Computer secondComputer = new Computer("Intel i3 13100F", 8, null, "Hp", "C345PO97");
        Computer thirdComputer = new Computer("AMD Ryzen 5 5600", 32, "AMD Radeon RX 6700 XT", null, null);
        Computer fourthComputer = new Computer("Intel i5 11400", 16, "Nvidia GeForce GTX 3060", "ASUS", "ROG Strix GT35");

        System.out.println(firstComputer.getModel());
        System.out.println(firstComputer.getProcessor());
        System.out.println(secondComputer.getCompany());
        System.out.println(secondComputer.getGraphicsCard());
        secondComputer.setGraphicsCard("Nvidia GeForce GTX 1060Ti");
        System.out.println(secondComputer.getGraphicsCard());
        System.out.println(thirdComputer.getRam());

        System.out.println(firstComputer.toString());
        System.out.println(secondComputer.hashCode());
        System.out.println(firstComputer.equals(fourthComputer));


    }
}
