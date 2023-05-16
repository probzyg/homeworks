package io.codelex.classesandobjects.practice;

import java.util.Arrays;

class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Sex: " + sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getMother() {
        return mother;
    }

    public String getFather() {
        return father;
    }

    public String fathersName() {
        if (father != null) {
            return father = getFather();
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother != null && otherDog.getMother() != null) {
            return true;
        }
        return false;
    }
}

