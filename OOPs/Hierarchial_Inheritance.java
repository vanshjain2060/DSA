package Vansh.OOPs;

public class Hierarchial_Inheritance {
   
    public static void main(String[] args) {
        Mammal monkey = new Mammal();
        Fish shark = new Fish();
        Bird sparrow = new Bird();

        monkey.color = "Brown";
        System.out.println(monkey.color);
        shark.eat();
        sparrow.breathe();
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
     public static Mammal monkey;

    void walk() {
        System.out.println("walks");
    }
}

// Derived class 2
class Fish extends Animal {
   public static Fish shark;

void swim() {
    System.out.println("swim");
   }
}

// Derived class 3
class Bird extends Animal {
   public static Bird sparrow;

void fly() {
    System.out.println("fly");
   }
}