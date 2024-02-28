package Vansh.Stacks;

import java.util.ArrayList;

public class StackAL {
    
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if(list.size() == 0) return -1;
            int del = list.get(list.size()-1);
            list.remove(list.size()-1);
            return del;
        }

        public static int peek() {
            if(list.size() == 0) return -1;
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
