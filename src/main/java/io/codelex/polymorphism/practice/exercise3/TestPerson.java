package io.codelex.polymorphism.practice.exercise3;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student(4.0);
        student.setFirstName("John");
        student.setLastName("Gilbert");
        student.setAddress("123 Random street");
        student.setId(1);

        Employee employee = new Employee("Software Engineer");
        employee.setFirstName("John");
        employee.setLastName("Goldberg");
        employee.setAddress("456 Random street");
        employee.setId(2);

        System.out.println(student.getClass().getSimpleName() + ":");
        student.display();
        System.out.println();
        System.out.println(employee.getClass().getSimpleName() + ":");
        employee.display();
    }
}
