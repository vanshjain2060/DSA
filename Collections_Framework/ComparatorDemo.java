import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ComparatorDemo {

    public static void main(String[] args) {

        System.out.println("--- Comparator Interface Demo ---");

        // --- Custom Class with Comparator (Lambda Expression) ---
        System.out.println("\n--- PriorityQueue with Custom Class (Comparator - Physics marks descending) ---");
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

        // Demonstrating Collections.sort with a custom Comparator
        List<StudentMarks> studentList = new ArrayList<>();
        studentList.add(new StudentMarks(70, 80));
        studentList.add(new StudentMarks(100, 88));
        studentList.add(new StudentMarks(40, 30));
        studentList.add(new StudentMarks(97, 75));
        studentList.add(new StudentMarks(38, 55));

        System.out.println("Original Student List: " + studentList);

        // Sort by Physics marks in ascending order using a Comparator
        Collections.sort(studentList, new Comparator<StudentMarks>() {
            @Override
            public int compare(StudentMarks s1, StudentMarks s2) {
                return s1.getPhysics() - s2.getPhysics(); // Ascending by Physics
            }
        });
        System.out.println("Sorted Student List (by Physics marks ascending - Anonymous Class): " + studentList);

        // Sort by total marks (Maths + Physics) in descending order using a lambda
        // Comparator
        Collections.sort(studentList,
                (s1, s2) -> (s2.getMaths() + s2.getPhysics()) - (s1.getMaths() + s1.getPhysics()));
        System.out.println("Sorted Student List (by Total marks descending - Lambda): " + studentList);
    }
}

// StudentMarks class (does not necessarily need to implement Comparable for
// Comparator usage)
class StudentMarks {
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
}

/*
 * Comparator Interface
 * The Comparator interface is used to define a "total ordering" on a collection
 * of objects. It is typically used when:
 * 
 * You want to sort objects of a class that does not implement Comparable.
 * 
 * You want to sort objects of a class that implements Comparable, but you need
 * a different sorting criterion than its natural ordering.
 * 
 * You need multiple ways to sort the same class of objects.
 * 
 * It has a single abstract method:
 * 
 * int compare(T o1, T o2): Compares its two arguments for order. Returns a
 * negative integer, zero, or a positive integer as the first argument is less
 * than, equal to, or greater than the second.
 * 
 * Key Points:
 * 
 * Comparator is a functional interface (can be used with lambda expressions).
 * 
 * It provides a way to define external sorting logic, separate from the class
 * itself.
 * 
 * Usage with Collections:
 * 
 * Collections like TreeSet and TreeMap can take a Comparator in their
 * constructor to define custom ordering for elements/keys.
 * 
 * PriorityQueue can take a Comparator in its constructor for custom priority
 * ordering.
 * 
 * Collections.sort(List<T> list, Comparator<? super T> c) and Arrays.sort(T[]
 * a, Comparator<? super T> c) can sort lists/arrays using a custom Comparator.
 */