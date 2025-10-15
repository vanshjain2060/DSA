import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        System.out.println("\n--- Stack Implementation ---");
        // --- Stack Implementation (LIFO - Last In, First Out) ---
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack after pushes: " + stack);

        // Peeking at the top of the stack (examines but does not remove)
        System.out.println("Element at the top (peek): " + stack.peek());

        // Popping elements from the stack (removes and returns the top)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after first pop: " + stack);

        System.out.println("Element at the top (peek after pop): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after all pops: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

/*
 * Stack Class
 * The Stack class in Java implements a Last-In, First-Out (LIFO) data
 * structure. It extends Vector.
 * 
 * Key Methods:
 * 
 * push(E item): Pushes an item onto the top of this stack.
 * 
 * pop(): Removes the object at the top of this stack and returns that object.
 * 
 * peek(): Looks at the object at the top of this stack without removing it from
 * the stack.
 * 
 * isEmpty(): Tests if this stack is empty.
 */