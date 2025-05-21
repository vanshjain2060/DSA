public class CountDistinctSubstring {
    private TrieNode root;
    private int count;

    public CountDistinctSubstring() {
        root = new TrieNode();
        count = 0;
    }

    public int countDistinctSubstring(String st) {
        int n = st.length();

        for (int i = 0; i < n; i++) {
            insert(st.substring(i, n));
        }

        return count + 1; // +1 to include the empty substring
    }

    public void insert(String s) {
        TrieNode node = root;

        for (char ch : s.toCharArray()) {
            if (node.links[ch - 'a'] == null) {
                count++;
                node.links[ch - 'a'] = new TrieNode();
            }
            node = node.links[ch - 'a'];
        }
    }

    private static class TrieNode {
        TrieNode[] links = new TrieNode[26];
    }

    public static void main(String[] args) {
        CountDistinctSubstring trie = new CountDistinctSubstring();

        // Example 1
        String st1 = "ababa";
        System.out.println("Output: " + trie.countDistinctSubstring(st1)); // Output: 10

        // Example 2
        String st2 = "abcd";
        System.out.println("Output: " + trie.countDistinctSubstring(st2)); // Output: 10

        // Example 3
        String st3 = "aaa";
        System.out.println("Output: " + trie.countDistinctSubstring(st3)); // Output: 6
    }
}