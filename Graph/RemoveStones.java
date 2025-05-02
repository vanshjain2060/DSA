import java.util.*;

public class RemoveStones {

    public static int findRemoveStones(int[][] stones) {
        int n = stones.length;
        DisjointSet ds = new DisjointSet(n);

        // Map rows and columns to unique indices
        Map<Integer, Integer> rowMap = new HashMap<>();
        Map<Integer, Integer> colMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int row = stones[i][0];
            int col = stones[i][1];

            // Union stones in the same row
            if (rowMap.containsKey(row)) {
                ds.unionBySize(i, rowMap.get(row));
            } else {
                rowMap.put(row, i);
            }

            // Union stones in the same column
            if (colMap.containsKey(col)) {
                ds.unionBySize(i, colMap.get(col));
            } else {
                colMap.put(col, i);
            }
        }

        // Count the number of unique components
        Set<Integer> uniqueParents = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueParents.add(ds.findUPar(i));
        }

        // The number of stones that can be removed is total stones - number of components
        return n - uniqueParents.size();
    }

    // this grid method will give MLE on LeetCode
    public static int findRemoveStonesUsingGrid(int[][] stones) {
        int r = 0, c = 0, n = stones.length;

        // Find the maximum row and column indices
        for (int[] temp : stones) {
            r = Math.max(r, temp[0]);
            c = Math.max(c, temp[1]);
        }
        r++;
        c++;

        DisjointSet ds = new DisjointSet(r * c);

        // Create a grid and mark the positions of stones
        int[][] grid = new int[r][c];
        for (int[] temp : stones) {
            grid[temp[0]][temp[1]] = 1;
        }

        // Union stones in the same row and column
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 0) continue;
                int node = i * c + j;
                for (int k = i + 1; k < r; k++) {
                    if (grid[k][j] == 1) ds.unionBySize(node, k * c + j);
                }
                for (int k = j + 1; k < c; k++) {
                    if (grid[i][k] == 1) ds.unionBySize(node, i * c + k);
                }
            }
        }

        // Count the number of unique components
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 0) continue;
                int node = i * c + j;
                set.add(ds.findUPar(node));
            }
        }

        // The number of stones that can be removed is total stones - number of components
        return n - set.size();
    }

    public static void main(String[] args) {
        int[][] stones = {
            {0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}
        };

        // Using the row-column mapping method
        int result1 = findRemoveStones(stones);
        System.out.println("Output using row-column mapping: " + result1); // Expected Output: 5

        // Using the grid-based method
        int result2 = findRemoveStonesUsingGrid(stones);
        System.out.println("Output using grid-based method: " + result2); // Expected Output: 5
    }
}