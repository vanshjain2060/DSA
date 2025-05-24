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

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        int length = longestCommonSubsequence(s1, s2);
        System.out.println("Length of LCS: " + length);
    }
}
