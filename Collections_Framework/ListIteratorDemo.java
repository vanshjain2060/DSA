import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
 
        // Getting ListIterator
        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("Going forward:");
        System.out.println(iterator.next()); // 1
        System.out.println(iterator.next()); // 2

        System.out.println("Going backward:");
        System.out.println(iterator.previous()); // 2
        System.out.println(iterator.previous()); // 1

        // Additional: iterate using loop
        System.out.println("\nFul   l forward iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nFull backward iteration:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
