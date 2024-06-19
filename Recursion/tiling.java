package Vansh.Recursion;

public class tiling {
    public static int tilingPorblem(int n) {// 2 * n is the size of the floor
        if(n == 0 || n == 1){
            return 1;
        }
        // the work is 
        /*
          ways in vertical choice = tilingProblem(n-1)
          and
          ways in horizontal choice = tilingProblem(n-2)

          to get the total number of ways just add the ways 
          of horizontal and verticals
         */
        int ways = tilingPorblem(n-1) + tilingPorblem(n-2);
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(tilingPorblem(2));
    }
}
