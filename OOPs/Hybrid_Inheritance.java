package Vansh.OOPs;

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Human Indian = new Human();
        Indian.color = "Brown";
        System.out.println(Indian.color);
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
// derived class 1(A)
class Dog extends Mammal {
    String breed;
}
// derived class 1(B)
class Cat extends Mammal {
    String flexiblity;
}
// derived class 1(C)
class Human extends Mammal {
    int height;
}

// Derived class 2
class Fish extends Animal {
   public static Fish shark;

void swim() {
    System.out.println("swim");
   }
}
// derived class 2(A) 
class shark extends Fish {
    int weight;
}
// derived class 2(B)
class tuna extends Fish {
    int teeth;
}

// Derived class 3
class Bird extends Animal {
   public static Bird sparrow;

void fly() {
    System.out.println("fly");
   }
}
// derives class 3(A)
class peacock extends Bird {
    int nails;
}