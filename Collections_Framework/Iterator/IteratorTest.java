package Iterator;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Get iterator from the list
        Iterator<Integer> iterator = list.iterator();

        // Iterate using hasNext() and next()
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using enhanced for-loop (foreach) which internally uses iterator
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}