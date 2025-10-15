import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ComparableDemo {

    public static void main(String[] args) {

        System.out.println("--- Comparable Interface Demo ---");

        // Example with Integer (implements Comparable naturally)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        System.out.println("Original numbers list: " + numbers);
        Collections.sort(numbers); // Sorts using natural ordering (Comparable)
        System.out.println("Sorted numbers list: " + numbers);

        System.out.println("\n--- Custom Class with Comparable ---");
        PriorityQueue<StudentMarks> studentPqComparable = new PriorityQueue<>();

        studentPqComparable.offer(new StudentMarks(70, 80)); // Math: 70
        studentPqComparable.offer(new StudentMarks(100, 88)); // Math: 100
        studentPqComparable.offer(new StudentMarks(40, 30)); // Math: 40
        studentPqComparable.offer(new StudentMarks(97, 75)); // Math: 97
        studentPqComparable.offer(new StudentMarks(38, 55)); // Math: 38

        System.out.println("Polling students (by Math marks - natural order, ascending):");
        while (!studentPqComparable.isEmpty()) {
            System.out.println(studentPqComparable.poll());
        }
        System.out.println();

        // Demonstrating Collections.sort with a custom Comparable class
        List<StudentMarks> studentList = new ArrayList<>();
        studentList.add(new StudentMarks(70, 80));
        studentList.add(new StudentMarks(100, 88));
        studentList.add(new StudentMarks(40, 30));
        studentList.add(new StudentMarks(97, 75));
        studentList.add(new StudentMarks(38, 55));

        System.out.println("Original Student List: " + studentList);
        Collections.sort(studentList); // Sorts using the compareTo method in StudentMarks
        System.out.println("Sorted Student List (by Math marks): " + studentList);
    }
}

// StudentMarks class implementing Comparable for natural ordering by maths
// marks
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
        // For ascending order by maths marks
        return this.maths - other.maths;
        // For descending order by maths marks: return other.maths - this.maths;
    }
}

/*
 * 
 * Comparable Interface
 * The Comparable interface is used to define the "natural ordering" of objects
 * of a class. It has a single method:
 * 
 * int compareTo(T o): Compares this object with the specified object for order.
 * Returns a negative integer, zero, or a positive integer as this object is
 * less than, equal to, or greater than the specified object.
 * 
 * Key Points:
 * 
 * Classes whose objects are meant to be ordered naturally (e.g., String,
 * Integer, Date) implement Comparable.
 * 
 * If you want to sort a collection of objects of your custom class based on a
 * single, default criterion, implement Comparable in that class.
 * 
 * The compareTo method defines the sorting logic. For ascending order,
 * this.value - other.value is common for numeric types.
 * 
 * Usage with Collections:
 * 
 * Collections like TreeSet and TreeMap use the compareTo method for ordering
 * elements/keys if no Comparator is provided.
 * 
 * PriorityQueue uses compareTo for natural ordering.
 * 
 * Collections.sort() and Arrays.sort() can sort lists/arrays of Comparable
 * objects.
 */