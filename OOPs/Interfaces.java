package Vansh.OOPs;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        // iabhfjkhhfwef
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal (by 1 step)");
    }
}

// Example 2 

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore,Carnivore {
    
}