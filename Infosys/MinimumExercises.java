import java.util.*;

public class MinimumExercises {
    // Unimplemented method
    public static int minimumExercises(int E, int N, int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=N-1; i>=0; i--) {
            if(arr[i] >= E) return count + 1;
            else if((2 * arr[i]) >= E) return count + 2;
            else E -= (2 * arr[i]);
            count += 2;
        }
        return E > 0 ? -1 : count;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
            {6, 2, 1, 2}, // Expected: 4
            {10, 2, 1, 2}, // Expected: -1
            {2, 3, 1, 5, 2}, // Expected: 1
            {15, 4, 3, 6, 2, 4}, // Expected: 3
            {20, 5, 5, 5, 5, 5, 5}, // Expected: 4
        };

        int[] expectedResults = {4, -1, 1, 3, 4};

        // Run test cases
        for (int i = 0; i < testCases.length; i++) {
            int E = testCases[i][0];
            int N = testCases[i][1];
            int[] A = Arrays.copyOfRange(testCases[i], 2, testCases[i].length);
            int result = minimumExercises(E, N, A);
            System.out.println("Test case " + (i + 1) + ": " + (result == expectedResults[i]));
        }
    }
}