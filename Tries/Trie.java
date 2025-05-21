public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (node.links[ch - 'a'] == null) {
                node.links[ch - 'a'] = new TrieNode();
            }
            node = node.links[ch - 'a'];
        }
        node.flag = true;
    }

    public boolean search(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (node.links[ch - 'a'] == null) return false;
            node = node.links[ch - 'a'];
        }
        return node.flag;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (char ch : prefix.toCharArray()) {
            if (node.links[ch - 'a'] == null) return false;
            node = node.links[ch - 'a'];
        }
        return true;
    }

    class TrieNode {
        TrieNode[] links = new TrieNode[26];
        boolean flag = false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        // Example Input
        System.out.println("Output:");
        System.out.println("null"); // For Trie initialization
        trie.insert("apple");
        System.out.println("null"); // For insert operation
        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app")); // false
        System.out.println(trie.startsWith("app")); // true
        trie.insert("app");
        System.out.println("null"); // For insert operation
        System.out.println(trie.search("app")); // true
    }
}