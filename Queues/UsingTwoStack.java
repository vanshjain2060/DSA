package Vansh.Queues;

import java.util.Stack;

public class UsingTwoStack {
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
    
        public static void add(int x) {
            while(!s1.isEmpty()) s2.push(s1.pop());
            s1.push(x);
            while(!s2.isEmpty()) s1.push(s2.pop());
        }
        
        public static int remove() {
            if(s1.isEmpty()) return -1;
            return s1.pop();
        }
        
        public static int peek() {
            if(s1.isEmpty()) return -1;
            return s1.peek();
        }
        
        public static boolean isEmpty() {
            return s1.isEmpty();
        }    
    }
    
    public static void main(String[] args) {
        Queue a = new Queue(); 
        a.add(1);
        a.add(2);
        a.add(3);

        while(!a.isEmpty()) {
            System.out.println(a.remove());
        }
    }
}
