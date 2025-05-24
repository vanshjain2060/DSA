class Solution {
    Integer[] dp;

    public int frogJumpII(int[] height, int k) {
        int n = height.length;
        if (n == 0)
            return 0;
        dp = new Integer[n];
        return helper(n - 1, height, k);
    }

    public int helper(int n, int[] height, int k) {
        if (n <= 0) return 0;
        if (dp[n] != null) return dp[n];

        int mini = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int prev = helper(n - i, height, k);
                if(prev != Integer.MAX_VALUE) {
                    mini = Math.min(mini, Math.abs(height[n] - height[n - i]) + prev);
                }
            }
        }
        return dp[n] = mini;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] heights = {10, 5, 20, 0, 15};
        int k = 2;
        int result = sol.frogJumpII(heights, k);
        System.out.println("Minimum cost: " + result);
    }
}