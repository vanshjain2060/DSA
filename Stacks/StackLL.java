package Vansh.Stacks;

public class StackLL {
    
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        static boolean isEmpty() {
            return head == null;    
        }

        static void push(int data) {
            Node nn = new Node(data);
            if(head == null) {
                head = nn;
                return;
            }
            nn.next = head;
            head = nn;
        }

        static int pop() {
            if(head == null) return -1;
            int del = head.data;
            head = head.next;
            return del;
        }

        static int peek() {
            if(head == null) return -1;
            return head.data;
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
