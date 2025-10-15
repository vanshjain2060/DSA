import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // --- PriorityQueue with Natural Ordering (Min-Heap by default for Integers)
        // ---
        System.out.println("--- PriorityQueue with Natural Ordering ---");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(100);
        pq.offer(1);
        pq.offer(50);
        pq.offer(0);
        pq.offer(75);

        System.out.println("PriorityQueue (natural order): " + pq);

        // Polling elements will give them in sorted order (min-heap)
        System.out.println("Polling elements (natural order):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\n");

        // --- PriorityQueue with Custom Ordering (Max-Heap for Integers) ---
        System.out.println("--- PriorityQueue with Custom Ordering (Max-Heap) ---");
        // Using a lambda expression for a custom comparator (descending order)
        PriorityQueue<Integer> maxHeapPq = new PriorityQueue<>((a, b) -> b - a);

        maxHeapPq.offer(100);
        maxHeapPq.offer(1);
        maxHeapPq.offer(50);
        maxHeapPq.offer(0);
        maxHeapPq.offer(75);

        System.out.println("PriorityQueue (custom order - max-heap): " + maxHeapPq);

        System.out.println("Polling elements (custom order - max-heap):");
        while (!maxHeapPq.isEmpty()) {
            System.out.print(maxHeapPq.poll() + " ");
        }
        System.out.println("\n");

        // --- Custom Class for PriorityQueue with Comparable Interface ---
        System.out.println("--- PriorityQueue with Custom Class (Comparable) ---");
        PriorityQueue<StudentMarks> studentPqComparable = new PriorityQueue<>();

        studentPqComparable.offer(new StudentMarks(70, 80));
        studentPqComparable.offer(new StudentMarks(100, 88));
        studentPqComparable.offer(new StudentMarks(40, 30));
        studentPqComparable.offer(new StudentMarks(97, 75));
        studentPqComparable.offer(new StudentMarks(38, 55));

        System.out.println("Polling students (by Math marks - natural order, ascending):");
        while (!studentPqComparable.isEmpty()) {
            System.out.println(studentPqComparable.poll());
        }
        System.out.println();

        // --- Custom Class for PriorityQueue with Comparator (Lambda) ---
        System.out.println("--- PriorityQueue with Custom Class (Comparator - Physics marks descending) ---");
        // Sort by Physics marks in descending order
        PriorityQueue<StudentMarks> studentPqComparator = new PriorityQueue<>(
                (s1, s2) -> s2.getPhysics() - s1.getPhysics());

        studentPqComparator.offer(new StudentMarks(70, 80));
        studentPqComparator.offer(new StudentMarks(100, 88));
        studentPqComparator.offer(new StudentMarks(40, 30));
        studentPqComparator.offer(new StudentMarks(97, 75));
        studentPqComparator.offer(new StudentMarks(38, 55));

        System.out.println("Polling students (by Physics marks - custom order, descending):");
        while (!studentPqComparator.isEmpty()) {
            System.out.println(studentPqComparator.poll());
        }
        System.out.println();
    }
}

// StudentMarks class for demonstration of Comparable and Comparator
class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{maths=" + maths + ", physics=" + physics + '}';
    }

    // Implementing Comparable for natural ordering (by maths marks ascending)
    @Override
    public int compareTo(StudentMarks other) {
        return this.maths - other.maths;
    }
}

/*
 * PriorityQueue Class
 * PriorityQueue is a concrete implementation of the Queue interface. Unlike a
 * normal queue which is based on insertion order (FIFO), a PriorityQueue is
 * based on the priority of its elements.
 * 
 * Characteristics:
 * 
 * Implementation is based on a priority heap (a tree-like structure).
 * 
 * Elements are ordered according to their natural ordering or by a Comparator
 * provided at queue construction time.
 * 
 * Elements of a priority queue are not sorted internally. It only guarantees
 * that elements can be removed in priority order.
 * 
 * Traversal using an iterator will not guarantee elements in sorted form. Never
 * iterate over a PriorityQueue if you expect sorted order.
 * 
 * Ordering:
 * 
 * Natural Ordering: If elements implement the Comparable interface, their
 * compareTo() method defines the natural ordering.
 * 
 * Total Ordering (Comparator): A Comparator can be passed to the PriorityQueue
 * constructor to define a custom ordering. This "total ordering" has higher
 * precedence than natural ordering.
 * 
 * ClassCastException:
 * 
 * If a PriorityQueue is created for a custom class, and that class does not
 * implement Comparable, and no Comparator is provided, a ClassCastException
 * will occur when elements are added or compared. This is because PriorityQueue
 * needs a comparison strategy to order elements.
 */