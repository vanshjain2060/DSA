public class TrieII {
    private TrieNode root;

    public TrieII() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (node.links[ch - 'a'] == null) {
                node.links[ch - 'a'] = new TrieNode();
            }
            node = node.links[ch - 'a'];
            node.prefixCount++; // Increment prefix count for each character
        }
        node.endsWith++; // Increment endsWith count for the last character
    }

    public int countWordsEqualTo(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (node.links[ch - 'a'] == null) return 0; // Word does not exist in the trie
            node = node.links[ch - 'a'];
        }
        return node.endsWith; // Return the count of words ending at this node
    }

    public int countWordsStartingWith(String prefix) {
        TrieNode node = root;

        for (char ch : prefix.toCharArray()) {
            if (node.links[ch - 'a'] == null) return 0; // Prefix does not exist in the trie
            node = node.links[ch - 'a'];
        }
        return node.prefixCount; // Return the count of words with this prefix
    }

    public void erase(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (node.links[ch - 'a'] == null) return; // Word does not exist in the trie
            node = node.links[ch - 'a'];
            node.prefixCount--; // Decrement prefix count for each character
        }
        node.endsWith--; // Decrement endsWith count for the last character
    }

    class TrieNode {
        TrieNode[] links = new TrieNode[26];
        int prefixCount = 0; // Tracks the number of words with this prefix
        int endsWith = 0;    // Tracks the number of words ending at this node
    }

    public static void main(String[] args) {
        TrieII trie = new TrieII();

        // Example Input
        System.out.println("Output:");
        System.out.println("null"); // For Trie initialization
        trie.insert("apple");
        System.out.println("null"); // For insert operation
        trie.insert("apple");
        System.out.println("null"); // For insert operation
        System.out.println(trie.countWordsEqualTo("apple")); // 2
        System.out.println(trie.countWordsStartingWith("app")); // 2
        trie.erase("apple");
        System.out.println("null"); // For erase operation
        System.out.println(trie.countWordsEqualTo("apple")); // 1
        System.out.println(trie.countWordsStartingWith("app")); // 1
        trie.erase("apple");
        System.out.println("null"); // For erase operation
        System.out.println(trie.countWordsStartingWith("app")); // 0
    }
}