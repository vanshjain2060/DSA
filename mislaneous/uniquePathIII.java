// package Vansh.mislaneous;

public class uniquePathIII {
    static int path = 0;
    static int empty = 1;
    public static void main(String[] args) {
        int[][] grid = {
                        {1,0,0,0},
                        {0,0,0,0},
                        {0,0,2,-1}
                       };
        int uniquePathCount = uniquePath(grid);
        System.out.println(uniquePathCount);
    }

    private static int uniquePath(int[][] grid) {
        int x=0, y=0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {
                if(grid[i][j] == 1) {x=i; y=j;}
                else if(grid[i][j] == 0) empty++;
            }
        }
        dfs(grid, x, y, 0);
        return path;
    }

    private static void dfs(int[][] grid, int x, int y, int count) {
        if(x<0 || x>=grid.length || y<0 || y>=grid.length || grid[x][y]==-1) return;
        if(grid[x][y] == 2) {
            if(empty == count) path++;
            return;
        }
        grid[x][y] = -1;
        dfs(grid, x+1, y, count+1);
        dfs(grid, x-1, y, count+1);
        dfs(grid, x, y+1, count+1);
        dfs(grid, x, y-1, count+1);
        grid[x][y] = 0;
        return;
    }
}