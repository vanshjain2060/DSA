public class LongestWordWithAllPrefixes {
    private static TrieNode root;

    public LongestWordWithAllPrefixes() {
        root = new TrieNode();
    }

    public static String longestWordWithAllPrefixes(String[] words) {
        for (String word : words) {
            insert(word);
        }
        String result = "";
        for(String word : words) {
            if(hasAllPrefixes(word)) {
                if(word.length() > result.length() || (word.length() == result.length() && word.compareTo(result) < 0)) result = word;
            }
        }
        return result;
    }

    public static void insert(String s) {
        TrieNode node = root;

        for(char ch : s.toCharArray()) {
            if(node.links[ch - 'a'] == null) {
                node.links[ch - 'a'] = new TrieNode();
            }
            node = node.links[ch - 'a'];
        }
        node.flag = true;
    }

    public static boolean hasAllPrefixes(String word) {
        TrieNode node = root;

        for(char ch : word.toCharArray()) {
            if(node.links[ch - 'a'] == null || !node.links[ch -'a'].flag) return false;
            node = node.links[ch - 'a'];
        }
        return true;
    }
    public static void main(String[] args) {

        // Example 1
        String[] words1 = {"k", "ki", "kir", "kira", "kiran"};
        System.out.println("Output: " + longestWordWithAllPrefixes(words1)); // Output: "kiran"

        // Example 2
        String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println("Output: " + longestWordWithAllPrefixes(words2)); // Output: "apple"

        // Example 3
        String[] words3 = {"abc", "bc", "ab", "qwe"};
        System.out.println("Output: " + longestWordWithAllPrefixes(words3)); // Output: ""
    }

    private static class TrieNode {
        TrieNode[] links = new TrieNode[26];
        boolean flag = false;
    }
}

