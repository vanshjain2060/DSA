import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        // --- Queue Implementation (FIFO - First In, First Out) ---
        System.out.println("--- Queue Implementation ---");
        // Always code against interfaces for best practice
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue using offer (preferred over add to avoid
        // exceptions)
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue after offers: " + queue);

        // Peeking at the head of the queue (examines but does not remove)
        System.out.println("Element at the head (peek): " + queue.peek());

        // Polling elements from the queue (removes and returns the head)
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after first poll: " + queue);

        System.out.println("Element at the head (peek after poll): " + queue.peek());

        System.out.println("Polled element: " + queue.poll());
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after all polls: " + queue);

        // Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
/*
 * Queue Interface
 * The Queue interface extends the Collection interface.
 * 
 * Methods for adding elements:
 * 
 * add(): Inherited from Collection, throws an IllegalStateException if the
 * queue is full.
 * 
 * offer(): Inserts the specified element. Returns true on success, false on
 * failure. Preferred over add() to avoid exceptions.
 * 
 * Methods for removing elements:
 * 
 * remove(): Removes and returns the head of the queue. Throws a
 * NoSuchElementException if the queue is empty.
 * 
 * poll(): Removes and returns the head of the queue. Returns null if the queue
 * is empty. Preferred over remove() to avoid exceptions.
 * 
 * Methods for examining elements (without removing):
 * 
 * element(): Returns the head of the queue. Throws a NoSuchElementException if
 * the queue is empty.
 * 
 * peek(): Returns the head of the queue. Returns null if the queue is empty.
 * Preferred over element() to avoid exceptions.
 * 
 * Implementations of Queue:
 * 
 * PriorityQueue
 * 
 * LinkedList (implements Deque, which in turn extends Queue)
 */