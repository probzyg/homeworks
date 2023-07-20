package io.codelex.oop.computers;

public class LaptopTest {
    public static void main(String[] args) {
        Laptop firstLaptop = new Laptop("Intel core i3 13400U", 8, "Intel UHD 730", "ASUS", "VivoBook", "3-Cell");
        Laptop secondLaptop = new Laptop("AMD Ryzen 5 4600H", 12, "Nvidia GeForce GTX 1660 Ti", "HP", "Pavilion 15-ec1046nr", "3-Cell");

        System.out.println(firstLaptop.getModel());
        System.out.println(firstLaptop.getGraphicsCard());
        System.out.println(firstLaptop.getRam());
        firstLaptop.setRam(16);
        System.out.println(firstLaptop.getRam());
        System.out.println(secondLaptop.getCompany());
        System.out.println(secondLaptop.getModel());

        System.out.println(firstLaptop.toString());
        System.out.println(secondLaptop.hashCode());
        System.out.println(firstLaptop.equals(secondLaptop));
    }
}
