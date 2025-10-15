import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        // --- ArrayList Implementation ---
        System.out.println("--- ArrayList Implementation ---");
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList after additions: " + arrayList);

        // Adding at a specific index
        arrayList.add(1, "Grape"); // Inserts at index 1
        System.out.println("ArrayList after adding Grape at index 1: " + arrayList);

        // Getting an element
        System.out.println("Element at index 2: " + arrayList.get(2)); // Should be Banana

        // Setting an element
        arrayList.set(0, "Apricot"); // Replaces Apple
        System.out.println("ArrayList after setting index 0 to Apricot: " + arrayList);

        // Removing an element by value
        arrayList.remove("Cherry");
        System.out.println("ArrayList after removing Cherry: " + arrayList);

        // Removing an element by index
        arrayList.remove(0); // Removes Apricot
        System.out.println("ArrayList after removing element at index 0: " + arrayList);

        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());
        System.out.println("Does ArrayList contain Banana? " + arrayList.contains("Banana"));
        System.out.println("Index of Banana: " + arrayList.indexOf("Banana"));

        arrayList.clear();
        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("Is ArrayList empty after clear? " + arrayList.isEmpty());

        // --- LinkedList Implementation ---
        System.out.println("\n--- LinkedList Implementation ---");
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");
        System.out.println("LinkedList after additions: " + linkedList);

        // LinkedList also supports List-specific methods like add(index, element),
        // get(index), etc.
        // But it's also a Deque, so it has offerFirst/Last, pollFirst/Last etc.
        linkedList.add(0, "Fish"); // Inserts at index 0
        System.out.println("LinkedList after adding Fish at index 0: " + linkedList);

        System.out.println("Element at index 1: " + linkedList.get(1)); // Should be Dog

        linkedList.remove("Cat");
        System.out.println("LinkedList after removing Cat: " + linkedList);

        System.out.println("Size of LinkedList: " + linkedList.size());
        linkedList.clear();
        System.out.println("LinkedList after clear: " + linkedList);
    }
}
/*
 * List Interface
 * The List interface extends the Collection interface. It represents an ordered
 * collection (also known as a sequence). Lists allow duplicate elements.
 * 
 * Key Characteristics:
 * 
 * Ordered: Elements are stored in a specific order, and that order is
 * maintained.
 * 
 * Indexed Access: Elements can be accessed by their integer index (position) in
 * the list.
 * 
 * Duplicates Allowed: A list can contain multiple elements that are equal to
 * each other.
 * 
 * Key Methods (examples):
 * 
 * add(E e): Appends the specified element to the end of this list.
 * 
 * add(int index, E element): Inserts the specified element at the specified
 * position in this list.
 * 
 * get(int index): Returns the element at the specified position in this list.
 * 
 * set(int index, E element): Replaces the element at the specified position in
 * this list with the specified element.
 * 
 * remove(Object o): Removes the first occurrence of the specified element from
 * this list, if it is present.
 * 
 * remove(int index): Removes the element at the specified position in this
 * list.
 * 
 * size(): Returns the number of elements in this list.
 * 
 * indexOf(Object o): Returns the index of the first occurrence of the specified
 * element in this list, or -1 if this list does not contain the element.
 * 
 * lastIndexOf(Object o): Returns the index of the last occurrence of the
 * specified element in this list, or -1 if this list does not contain the
 * element.
 * 
 * Implementations of List:
 * 
 * ArrayList
 * 
 * LinkedList
 * 
 * Vector (legacy, synchronized)
 */