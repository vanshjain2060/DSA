public class LongestCommonSubstring {

    static Integer[][] dp;
    public static int longestCommonSubstring(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();

        dp = new Integer[n1 + 1][n2 + 1];
        return helper(n1 - 1, n2 - 1, s1, s2);
    }

    public static int helper(int n1, int n2, String s1, String s2) {
        if (n1 < 0 || n2 < 0) return 0;

        if (dp[n1][n2] != null) return dp[n1][n2];

        return dp[n1][n2] = (s1.charAt(n1) == s2.charAt(n2)) ? 1 + helper(n1 - 1, n2 - 1, s1, s2) : 0;
    }

    public static int longestCommonSubstringTabulation(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        int maxLength = 0;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLength;
    }

    public static String printLongestCommonSubstring(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        int maxLength = 0, endIndex = -1;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return (endIndex != -1) ? s1.substring(endIndex - maxLength + 1, endIndex + 1) : "";
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abfce";

        int length = longestCommonSubstring(s1, s2);
        System.out.println("Length of Longest Common Substring (Memoization): " + length);

        length = longestCommonSubstringTabulation(s1, s2);
        System.out.println("Length of Longest Common Substring (Tabulation): " + length);

        String lcs = printLongestCommonSubstring(s1, s2);
        System.out.println("Longest Common Substring (Tabulation): " + lcs);
    }
}
