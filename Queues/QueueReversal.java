package Vansh.Queues;
import java.util.*;
public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=5; i++) {
            q.add(i);
        }
        reversal(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    // private static void reversal(Queue<Integer> q) {
    //     if(q.isEmpty()) return;
    //     int temp = q.remove();
    //     reversal(q);
    //     q.add(temp);
    // }

    private static void reversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}
