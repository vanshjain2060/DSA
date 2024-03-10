package Vansh.Queues;
import java.util.*;;
public class DeQue {
    //Implementing Queue using Deque
    static class Queue {
        static Deque<Integer> d = new LinkedList<>();

        public void add(int data) {
            d.addLast(data);
        }
        public int remove() {
            return d.removeFirst();
        }
        public int peek() {
            return d.peekFirst();
        }
    }
    //Implementing Stack using Deque
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();

        public void push(int data) {
            d.addLast(data);
        }
        public int pop() {
            return d.removeLast();
        }
        public int peek() {
            return d.peekLast();
        }
    }
    public static void main(String[] args) {
        Queue a = new Queue();
        // Stack a = new Stack();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println("peek = " + a.peek());
        System.out.println(a.remove());
        System.out.println(a.remove());
        System.out.println(a.remove());
    }
    
}
