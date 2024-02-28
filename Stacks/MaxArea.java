package Vansh.Stacks;

import java.util.Stack;

public class MaxArea {
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(heights));
    }

    private static int maxArea(int[] heights) {
        int nsl[] = nextSmallestLeft(heights);
        int nsr[] = nextSmallestRight(heights);
        int maxA = 0;
        for(int i=0; i<heights.length; i++) {
            int currArea = heights[i] * (nsr[i] - nsl[i] -1);
            maxA = Math.max(maxA, currArea);
        }
        return maxA;
    }

    public static int[] nextSmallestRight(int arr[]) {
        int[] nsr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]) s.pop();            
            if(s.isEmpty()) nsr[i] = arr.length;
            else nsr[i] = s.peek(); System.out.print(nsr[i] + "  ");
            s.push(i);
        }System.out.println();
        return nsr;
    }

    public static int[] nextSmallestLeft(int[] arr) {
        int[] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]) s.pop();           
            if(s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i);
        }
        return nsl;
    }
   
}
