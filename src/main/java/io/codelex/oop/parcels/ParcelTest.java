package io.codelex.oop.parcels;


public class ParcelTest {
    public static void main(String[] args) {
        Parcel first = new Parcel(240, 30, 30, 16, true);
        Parcel second = new Parcel(45, 30, 30, 31, false);
        Parcel third = new Parcel(45, 30, 30, 14, true);
        Parcel fourth = new Parcel(45, 30, 30, 16, true);
        Parcel fifth = new Parcel(25, 30, 30, 16, false);
        Parcel sixth = new Parcel(30, 30, 25, 16, true);

        System.out.println("First parcel: ");
        first.validate();
        System.out.println("Second parcel: ");
        second.validate();
        System.out.println("Third parcel: ");
        third.validate();
        System.out.println("Fourth parcel: ");
        fourth.validate();
        System.out.println("Fifth parcel:");
        fifth.validate();
        System.out.println("Sixth parcel: ");
        sixth.validate();
    }
}
