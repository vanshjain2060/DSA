public class LongestPalindromicSubsequence {

    static Integer[][] dp;

    // Method 1: Solve using Memoization
    public static int longestPalindromicSubsequenceMemo(String s) {
        int n = s.length();
        dp = new Integer[n][n];
        return helper(0, n - 1, s);
    }

    private static int helper(int i, int j, String s) {
        if (i > j) return 0;
        if (i == j) return 1;

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + helper(i + 1, j - 1, s);
        } else {
            return dp[i][j] = Math.max(helper(i + 1, j, s), helper(i, j - 1, s));
        }
    }

    // Method 2: Solve using Tabulation
    public static int longestPalindromicSubsequenceTabulation(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    // Method 3: Display the Longest Palindromic Subsequence
    public static String printLongestPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0, j = n - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                sb.append(s.charAt(i));
                i++;
                j--;
            } else if (dp[i + 1][j] > dp[i][j - 1]) {
                i++;
            } else {
                j--;
            }
        }

        String firstHalf = sb.toString();
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();
        if (firstHalf.length() > 0 && s.charAt(i - 1) == s.charAt(j + 1)) {
            return firstHalf + secondHalf.substring(1);
        } else {
            return firstHalf + secondHalf;
        }
    }

    public static void main(String[] args) {
        String s = "bbbab";

        int lengthMemo = longestPalindromicSubsequenceMemo(s);
        System.out.println("Length of Longest Palindromic Subsequence (Memoization): " + lengthMemo);

        int lengthTab = longestPalindromicSubsequenceTabulation(s);
        System.out.println("Length of Longest Palindromic Subsequence (Tabulation): " + lengthTab);

        String lps = printLongestPalindromicSubsequence(s);
        System.out.println("Longest Palindromic Subsequence: " + lps);
    }
}
