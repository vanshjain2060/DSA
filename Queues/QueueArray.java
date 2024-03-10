package Vansh.Queues;

public class QueueArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear==-1;
        } 

        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("queue is full"); return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }

        public static void main(String[] args) {
            Queue a = new Queue(5);
            a.add(1);
            a.add(2);
            a.add(3);

            while(!a.isEmpty()) {
                System.out.println(a.remove());
            }
        }
    }
}
