package Vansh.OOPs;

public class AbstractClass {
    public static void main(String[] args) {

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // h.changeColor();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
        myHorse.eat();
    }
}

abstract class Animal {

    String color;
    Animal() {
        // color ="brown";
        System.out.println("Animal constructor called");
    }
   // this is a non_abstract class
    void eat() {
       System.out.println("animals eats");
    }

    // this is a abstract class
    abstract void walk();
    /* yeh bas ek idea de rhaa hai ki 
    ek walk function hoga jo koee parameter nhi lega
    and har class jo bhee is class ko extend karegi 
    vo apne heesab se iska implementation kargei  */
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
  Mustang() {
    System.out.println("Mustang constructor called");
  }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

// optput me aana cahiye
/*
Animal constructor called
Horse constructor called
Mustang constructor called
 */
// par animal show nhi ho rhaa hai