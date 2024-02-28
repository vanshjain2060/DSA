package Vansh.Stacks;

import java.util.Stack;

public class NextGreatest {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
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
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]) s.pop();
            if(s.isEmpty()) nextGreatest[i] = -1;
            else nextGreatest[i] = arr[s.peek()];
            s.push(i);
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
 