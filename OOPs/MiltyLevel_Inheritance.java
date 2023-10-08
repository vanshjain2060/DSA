package Vansh.OOPs;

public class MiltyLevel_Inheritance {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.eat();
        tommy.legs = 4;
        System.out.println(tommy.legs + " Legs");
        tommy.breed = "boxer Dog";
        System.out.println(tommy.breed);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class 1
class Mammal extends Animal {
    int legs;
}

// Derives class 1(A)
class Dog extends Mammal {
    String breed; 
}