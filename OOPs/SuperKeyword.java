package Vansh.OOPs;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h= new Horse();
        System.out.println(h.color);
    }
    
}

class Animall {
    String color;
    Animall() {
        System.out.println("Animmal constructor is called");
    }
}

class Horse extends Animall {
    Horse() {
        super.color = "brown";
     //   super();
        System.out.println("horse consturctor is called");
    }
}

/* iska output aana cahiye
 * Animmal constructor is called
 * horse consturctor is called
 * brown
  */