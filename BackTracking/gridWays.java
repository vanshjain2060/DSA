package Vansh.BackTracking;

public class gridWays {
    

    static int gridways(int i , int j , int n , int m) {
    /* agar koee bhee ek max ho gya to sirf stright he ja kaste hai that is only one way  */
        if(i == m || j == n ) return 1;

        // recursion
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1 + w2;
    }



    // SAME CONDE WITH BOTTOM UP APPROACH
    static int uniquePaths(int m, int n) {
        // Base case: if either m or n is 1, there is only one path
        if (m == 1 || n == 1) {
            return 1;
        }
        // Recursive call: calculate the number of paths by adding the number of paths from the top and left cells
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }



    public static void main(String[] args) {
        int n=3, m=4;
        int [][] grid = {{2,3,4},
                         {4,6,5},
                         {7,-8,9}};

        System.out.println(minCost(grid , 0 ,0));
        System.out.println(gridways(1, 1, n, m));
        System.out.println(uniquePaths(n,m));
        System.out.println(GRID(n, m));
    }



    // to go from least value path
    static int minCost(int[][] grid , int r , int c) {
  
        if(r == grid.length-1 && c == grid[0].length-1) return grid[r][c];

        if(r>=grid.length || c>=grid[0].length) return Integer.MAX_VALUE;

        int right =  minCost(grid, r, c+1);
        int left =   minCost(grid, r+1, c);

        return Math.min(right , left) + grid[r][c];
    }



    // this is the code with least time complexity O(n)
    static int GRID(int n , int m) {
        int ans = fact(n-1+m-1) / (fact(n-1)*fact(m-1));
        return ans ;
    }
    static int fact(int i) {
        if(i == 1) return 1;
        return i*fact(i-1);
    }


}
