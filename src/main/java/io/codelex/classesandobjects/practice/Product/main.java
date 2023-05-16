package io.codelex.classesandobjects.practice.Product;

public class main {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70, 14);
        Product iphone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        iphone.printProduct();
        epson.printProduct();

        mouse.changeQuantity(13);
        iphone.changeQuantity(8);
        epson.changeQuantity(2);

        mouse.changePrice(65);
        iphone.changePrice(859.99);
        epson.changePrice(430.46);

        mouse.printProduct();
        iphone.printProduct();
        epson.printProduct();
    }
}
