public class PrintLongestCommonSubsequence {

    public static int longestCommonSubsequence(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];

        // Fill the dp table
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        // Reconstruct the LCS from the dp table
        StringBuilder sb = new StringBuilder();
        int i = n1, j = n2;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        // Print the LCS
        System.out.println("Longest Common Subsequence: " + sb.reverse().toString());

        return dp[n1][n2];
    }

    public static int longestCommonSubsequenceMemo(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        Integer[][] dp = new Integer[n1 + 1][n2 + 1];
        return helper(n1, n2, s1, s2, dp);
    }

    private static int helper(int i, int j, String s1, String s2, Integer[][] dp) {
        if (i == 0 || j == 0) return 0;

        if (dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = 1 + helper(i - 1, j - 1, s1, s2, dp);
        } else {
            return dp[i][j] = Math.max(helper(i - 1, j, s1, s2, dp), helper(i, j - 1, s1, s2, dp));
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        int length = longestCommonSubsequence(s1, s2);
        System.out.println("Length of LCS: " + length);

        int lengthMemo = longestCommonSubsequenceMemo(s1, s2);
        System.out.println("Length of LCS using Memoization: " + lengthMemo);
    }
}
