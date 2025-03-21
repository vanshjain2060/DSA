/**
 * 🚪Open/Closed Principle
 * This principle states that Software entities (classes, modules, functions,
 * etc.) should be open for extension, but closed for modification which means
 * you should be able to extend a class behavior, without modifying it.
 * 
 * 🌟Why it matters:
 * • Prevents breaking existing code.
 * • Encourages reusable components.
 * 
 * ‍
 * 
 * 💭Example:
 * Suppose we have a Shape class that calculates the area of different shapes.
 * Initially, it supports only circles and rectangles. Adding a new shape, like
 * a triangle, would require modifying the existing code.
 * 
 * The Open/Closed Principle states that software entities should be open for
 * extension but closed for modification.
 */

// This is the example of Open Close principle

public class OpenClose {
    public interface Shape {
        abstract double calculateArea();
    }

    static class Circle implements Shape {
        private double radius;

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        private double width, height;

        @Override
        public double calculateArea() {
            return height * width;
        }
    }

    // Adding a new shape without modifying existing code
    static class Triangle implements Shape {
        private double base, height;

        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.base = 1.56;
        t.height = 3.63;
        System.out.println(t.calculateArea());
    }
}

/**
 * In the above code example, the Shape class has multiple responsibilities:
 * calculating the area for different shapes. This violates the Open/Closed
 * Principle because adding a new shape, like a triangle, requires modifying the
 * existing code. This can lead to potential bugs and makes the code harder to
 * maintain. When a new shape is introduced, the calculateArea method must be
 * updated to handle the new shape, which increases the risk of errors and makes
 * the code less flexible. This approach tightly couples the Shape class to the
 * specific shapes it supports, reducing its extensibility.
 * 
 * ‍
 * 
 * Moreover, this design makes it difficult to add new shapes without altering
 * the existing codebase. Each time a new shape is added, the Shape class must
 * be modified, which can introduce unintended side effects and disrupt the
 * functionality of the existing shapes. This lack of modularity and
 * extensibility makes the system harder to maintain and evolve over time. By
 * adhering to the Open/Closed Principle, we can create a more robust and
 * maintainable system where new shapes can be added without modifying the
 * existing code, thus reducing the risk of bugs and improving the overall
 * design.
 * 
 * ‍
 * 
 * Instead, we can implement the Open/Closed principle correctly by creating and
 * abstract class / Interface of Shape and all the other classes will
 * extend/inherit the methods of the Shape class efficiently following the
 * Open/Closed Principle.
 */