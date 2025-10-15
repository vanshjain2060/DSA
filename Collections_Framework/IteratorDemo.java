import java.util.Iterator;

public class IteratorDemo<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public IteratorDemo() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public void add(T item) {
        items[size++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            System.out.println("hasNext called");
            return index < size;
        }

        @Override
        public T next() {
            System.out.println("next called");
            return items[index++];
        }
    }

    // Test the iterator with a main method
    public static void main(String[] args) {
        IteratorDemo<Integer> list = new IteratorDemo<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Using traditional iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\\nUsing for-each loop:");
        for (int value : list) {
            System.out.println(value);
        }
    }
}
