import java.util.*;

class SubSequence {

    // Check if string is palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static int maxProduct(String s) {
        int n = s.length();
        int total = 1 << n; // 2^n masks
        Map<Integer, Integer> m = new HashMap<>();

        // Generate all subsequences and check palindromes
        for (int mask = 1; mask < total; mask++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) > 0) {
                    sb.append(s.charAt(i));
                }
            }
            if (isPalindrome(sb.toString())) {
                m.put(mask, sb.length());
                System.out.print(sb + "  ");
            }
        }
System.out.println();
        int maxScore = 0;

        // Try all pairs of non-overlapping palindromic subsequences
        for (int m1 : m.keySet()) {
            for (int m2 : m.keySet()) {
                if ((m1 & m2) == 0) { // non-overlapping
                    // System.out.println(m1 + " " + m2);
                    // System.out.println(m.get(m1) + " " + m.get(m2));
                    maxScore = Math.max(maxScore, m.get(m1) * m.get(m2));
                }
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        String s = "attract";
        System.out.println("Max Score: " + maxProduct(s));
    }
}
