import java.util.Stack;

public class MaxArea {
    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(heights));
        System.out.println(maxAreaHistogram(heights));
    }

    // this is the most optimized method in terms of both time and space
    public static int maxAreaHistogram(int[] arr) {
        int n = arr.length, maxi = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!s.isEmpty() && (i == n || arr[i] < arr[s.peek()])) {
                int height = arr[s.pop()];
                int width = s.isEmpty() ? i : (i - s.peek() - 1);
                maxi = Math.max(maxi, height * width);
            }
            s.push(i);
        }
        return maxi;
    }

    private static int maxArea(int[] heights) {
        int nsl[] = nextSmallestLeft(heights);
        int nsr[] = nextSmallestRight(heights);
        int maxA = 0;
        for (int i = 0; i < heights.length; i++) {
            int currArea = heights[i] * (nsr[i] - nsl[i] - 1);
            maxA = Math.max(maxA, currArea);
        }
        return maxA;
    }

    public static int[] nextSmallestRight(int arr[]) {
        int[] nsr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()])
                s.pop();
            if (s.isEmpty())
                nsr[i] = arr.length;
            else
                nsr[i] = s.peek();
            s.push(i);
        }
        return nsr;
    }

    public static int[] nextSmallestLeft(int[] arr) {
        int[] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()])
                s.pop();
            if (s.isEmpty())
                nsl[i] = -1;
            else
                nsl[i] = s.peek();
            s.push(i);
        }
        return nsl;
    }

}
