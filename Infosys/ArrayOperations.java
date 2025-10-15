import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ArrayOperations {

    private static final int MOD = 1000000007;

    public int solve(int n, List<Integer> A, int q, List<List<Integer>> queries) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations solver = new ArrayOperations();

        System.out.println("--- Running Sample 1 ---");
        int n1 = 7;
        List<Integer> A1 = new ArrayList<>(Arrays.asList(1, 4, 5, 1, 6, 7, 8));
        int q1 = 5;
        List<List<Integer>> queries1 = new ArrayList<>();
        queries1.add(Arrays.asList(1, 1, 6));
        queries1.add(Arrays.asList(1, 1, 5));
        queries1.add(Arrays.asList(2, 5, 5));
        queries1.add(Arrays.asList(2, 3, 4));
        queries1.add(Arrays.asList(2, 3, 3));

        List<List<Integer>> adjustedQueries1 = new ArrayList<>();
        for (List<Integer> query : queries1) {
            if (query.get(0) == 1 || query.get(0) == 2) {
                adjustedQueries1.add(Arrays.asList(query.get(0), query.get(1) - 1, query.get(2) - 1));
            } else {
                adjustedQueries1.add(query);
            }
        }
        System.out.println("Sample 1 Output: " + solver.solve(n1, A1, q1, adjustedQueries1));

        System.out.println("--- Running Sample 2 ---");
        int n2 = 7;
        List<Integer> A2 = new ArrayList<>(Arrays.asList(3, 7, 4, 2, 5, 3, 7));
        int q2 = 5;
        List<List<Integer>> queries2 = new ArrayList<>();
        queries2.add(Arrays.asList(1, 0, 4));
        queries2.add(Arrays.asList(2, 0, 1));
        queries2.add(Arrays.asList(1, 3, 6));
        queries2.add(Arrays.asList(2, 3, 3));
        queries2.add(Arrays.asList(2, 0, 5));
        System.out.println("Sample 2 Output: " + solver.solve(n2, A2, q2, queries2));

        System.out.println("--- Running Sample 3 ---");
        int n3 = 7;
        List<Integer> A3 = new ArrayList<>(Arrays.asList(1, 8, 6, 10, 5, 6, 9));
        int q3 = 5;
        List<List<Integer>> queries3 = new ArrayList<>();
        queries3.add(Arrays.asList(2, 0, 3));
        queries3.add(Arrays.asList(1, 2, 3));
        queries3.add(Arrays.asList(1, 0, 6));
        queries3.add(Arrays.asList(2, 1, 4));
        queries3.add(Arrays.asList(2, 6, 6));
        System.out.println("Sample 3 Output: " + solver.solve(n3, A3, q3, queries3));

        scanner.close();
    }
}
