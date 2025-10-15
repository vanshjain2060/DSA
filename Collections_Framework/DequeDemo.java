import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {

        // --- Deque Implementation (Double-Ended Queue) ---
        System.out.println("--- Deque Implementation ---");
        // ArrayDeque is a common concrete implementation for Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // --- Using Deque as a Stack (LIFO) ---
        System.out.println("\n--- Deque as a Stack (LIFO) ---");
        // Push elements to the front (head)
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        System.out.println("Deque after offerFirst (as stack pushes): " + deque);

        // Pop elements from the front (head)
        System.out.println("Polled first element (as stack pop): " + deque.pollFirst());
        System.out.println("Deque after pollFirst: " + deque);

        // Peek at the front (head)
        System.out.println("Peek first element (as stack peek): " + deque.peekFirst());

        // --- Using Deque as a Queue (FIFO) ---
        System.out.println("\n--- Deque as a Queue (FIFO) ---");
        deque.clear();
        System.out.println("Deque cleared: " + deque);

        // Offer elements to the end (tail)
        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerLast(30);
        System.out.println("Deque after offerLast (as queue offers): " + deque);

        // Poll elements from the front (head)
        System.out.println("Polled first element (as queue poll): " + deque.pollFirst());
        System.out.println("Deque after pollFirst: " + deque);

        // Peek at the front (head)
        System.out.println("Peek first element (as queue peek): " + deque.peekFirst());

        // --- Double-Ended Operations ---
        System.out.println("\n--- Deque Double-Ended Operations ---");
        deque.clear();
        deque.offerFirst(100);
        deque.offerLast(200);
        deque.offerFirst(50);
        deque.offerLast(250);
        System.out.println("Deque for double-ended operations: " + deque);

        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Deque after pollFirst: " + deque);

        System.out.println("Poll last: " + deque.pollLast());
        System.out.println("Deque after pollLast: " + deque);

        System.out.println("Is deque empty? " + deque.isEmpty());
        deque.clear();
        System.out.println("Is deque empty after clear? " + deque.isEmpty());
    }
}

/*
 * Deque Interface
 * Deque (Double-Ended Queue) is an interface that extends the Queue interface,
 * allowing operations at both ends. It can be used as a FIFO queue or a LIFO
 * stack.
 * 
 * Characteristics:
 * 
 * Allows elements to be inserted or removed from either end (head or tail).
 * 
 * Can be used as a FIFO (First-In, First-Out) queue.
 * 
 * Can be used as a LIFO (Last-In, First-Out) stack.
 * 
 * Deques are not lists, so they cannot be randomly accessed based on their
 * positions.
 * 
 * Deques cannot be sorted.
 * 
 * Key Methods (examples, prefer offer/poll/peek over add/remove/get):
 * 
 * Adding:
 * 
 * offerFirst(e): Inserts element at the front.
 * 
 * offerLast(e): Inserts element at the end.
 * 
 * push(e): Pushes an element onto the stack represented by this deque
 * (equivalent to offerFirst).
 * 
 * addFirst(e): Adds an element to the front.
 * 
 * addLast(e): Adds an element to the end.
 * 
 * Removing:
 * 
 * pollFirst(): Retrieves and removes the first element.
 * 
 * pollLast(): Retrieves and removes the last element.
 * 
 * pop(): Pops an element from the stack represented by this deque (equivalent
 * to pollFirst).
 * 
 * removeFirst(): Removes the first element.
 * 
 * removeLast(): Removes the last element.
 * 
 * Examining:
 * 
 * peekFirst(): Retrieves, but does not remove, the first element.
 * 
 * peekLast(): Retrieves, but does not remove, the last element.
 * 
 * getFirst(): Retrieves the first element.
 * 
 * getLast(): Retrieves the last element.
 * 
 * Implementations of Deque:
 * 
 * ArrayDeque (concrete implementation)
 * 
 * LinkedList (also implements List)
 * 
 * Usage Recommendation:
 * 
 * For a normal FIFO queue, use LinkedList.
 * 
 * For a stack, use Stack class or ArrayDeque.
 * 
 * For a double-ended queue, use ArrayDeque.
 */