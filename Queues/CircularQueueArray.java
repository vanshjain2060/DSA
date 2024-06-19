package Vansh.Queues;

public class CircularQueueArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        } 

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void add(int data) {
            if(isFull()) {
                System.out.println("queue is full"); return;
            }
            // if first element
            if(front==-1) front=0;
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int f = arr[front];
            // deleting last element then if condition
            if(rear == front) rear = front = -1;
            else front = (front+1)%size;
            return f;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {
            Queue a = new Queue(3);
            a.add(1);
            a.add(2);
            a.add(3);
            System.out.println(a.remove());
            a.add(4);
            System.out.println(a.remove());
            a.add(5);

            while(!a.isEmpty()) {
                System.out.println(a.remove());
            }
        }
    }
}