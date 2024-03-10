package Vansh.Queues;
import java.util.*;;
public class DeQue {
    //Implementing Queue using Deque
    static class Queue {
        static Deque<Integer> d = new LinkedList<>();

        public static void add(int data) {
            d.addLast(data);
        }
        public static int remove() {
            return d.removeFirst();
        }
        public static int peek() {
            return d.peekFirst();
        }
    }
    //Implementing Stack using Deque
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();

        public static void push(int data) {
            d.addLast(data);
        }
        public static int pop() {
            return d.removeLast();
        }
        public static int peek() {
            return d.peekLast();
        }
    }
    public static void main(String[] args) {
        // Queue a = new Queue();
        Stack a = new Stack();
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println("peek = " + a.peek());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
    
}
