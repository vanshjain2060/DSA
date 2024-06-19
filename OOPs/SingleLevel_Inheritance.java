package Vansh.OOPs;

public class SingleLevel_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
        shark.color = "Blue";
        System.out.println(shark.color);
    }
}
// buddy i'm here
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

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
       System.out.println("swims in water");
    }

    public void color(String string) {
    }
}
 