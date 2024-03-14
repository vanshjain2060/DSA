package Vansh.Stacks;

import java.util.Stack;

public class NextGreatest {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2};
        int nextGreatestRight[] = new int[arr.length];
        int nextGreatestLeft[] = new int[arr.length];

        GreatestLeft(arr, nextGreatestLeft);
        GreatestRight(arr, nextGreatestRight);
        
        for(int i : nextGreatestRight) {
            System.out.print(i + " ");
        }
    }

    private static void GreatestRight(int[] arr, int[] nextGreatest) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        for(int i=2*n-2; i>=0; i--) {
            while(!s.isEmpty() && arr[i%n] >= arr[s.peek()]) s.pop();
            if(s.isEmpty()) nextGreatest[i%n] = -1;
            else nextGreatest[i%n] = arr[s.peek()];
            s.push(i%n);
        }
    }

    public static void GreatestLeft(int arr[], int[] ngl) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]) s.pop();
            if(s.isEmpty()) ngl[i] = -1;
            else ngl[i] = arr[s.peek()];
            s.push(i);
        }
    }
}
 