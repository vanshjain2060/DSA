package Vansh.Queues;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node n = new Node(data);
            if(head == null) {
                head = tail = n;
                return;
            }
            tail.next = n;
            tail = n;;
        }

        public static int remove() {
            if(isEmpty()) return -1;
            int ret = head.data;
            if(head == tail) {head = tail = null; return ret;}
            head = head.next;
            return ret;
        }

        public static int peek() {
            return head.data;
        }
        public static void main(String[] args) {
            Queue a = new Queue();
            a.add(1);
            a.add(2);
            a.add(3);
            
            while(!a.isEmpty()) {
                System.out.println(a.peek());
                a.remove();
            }
        }
    }
}
