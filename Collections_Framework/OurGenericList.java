import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public OurGenericList() {
        items = (T[]) new Object[100]; // initial size
        size = 0;
    }

    // Add an element to the list
    public void add(T item) {
        items[size++] = item;
    }

    // Add all elements from another OurGenericList
    public void addAll(OurGenericList<T> other) {
        for (T item : other) {
            this.add(item);
        }
    }

    // Get an element at a specific index
    public T get(int index) {
        return items[index];
    }

    // Return the current size of the list
    public int size() {
        return size;
    }

    // Find the index of a specific element
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(value)) {
                return i;
            }
        }
        return -1; // not found
    }

    // Provide iterator for for-each loop
    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    // Inner class for iterator logic
    private class OurGenericListIterator implements Iterator<T> {
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }

    // Sample driver code
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();

        // Using add method
        list.add(1);
        list.add(2);
        list.add(3);

        // Using get method
        System.out.println("Element at index 1: " + list.get(1));

        // Using size method
        System.out.println("Current size of list: " + list.size());

        // Using iterator (for-each loop)
        System.out.println("Iterating over the list:");
        for (int item : list) {
            System.out.println(item);
        }

        // Using indexOf
        System.out.println("Index of element 2: " + list.indexOf(2));

        // Using addAll
        OurGenericList<Integer> secondList = new OurGenericList<>();
        secondList.add(4);
        secondList.add(5);
        list.addAll(secondList);

        System.out.println("List after using addAll:");
        for (int item : list) {
            System.out.println(item);
        }

        // to convert list to array
        // Integer[] arr = list.toArray(new Integer[0]);
        // putting 0 because it will create a new array of the exact size of the list
    }
}
