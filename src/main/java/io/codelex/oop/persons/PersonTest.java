package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Employee johnBrown = new Employee("John","Brown", "115", 35, "Accountant", LocalDate.of(2016,1,15));
        Customer peterBrown = new Customer("Peter", "Brown", "CID1234", 30, "CID1234", 10);
        System.out.println(johnBrown.getInfo());
        System.out.println(peterBrown.getInfo());
    }
}
