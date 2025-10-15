package Iterator;
import java.util.Iterator;

// Custom generic list class implementing Iterable<T>
public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public OurGenericList() {
        items = (T[]) new Object[100];  // underlying array
        size = 0;
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public int size() {
        return size;
    }

    // Implementing Iterable interface method
    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator();
    }

    // Inner private class implementing Iterator<T>
    private class OurGenericListIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return items[index++];
        }
    }

    // Testing the iterable and iterator
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Using iterator explicitly
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using enhanced for-loop (foreach)
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}