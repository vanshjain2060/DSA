package Vansh.LinkedList2;
import java.util.LinkedList;
public class Classroom {
    
    
public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // add operation 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(0);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
