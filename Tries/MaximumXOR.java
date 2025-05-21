public class MaximumXOR {
    private static class TrieNode {
        TrieNode[] links = new TrieNode[2]; // Each node has two children: 0 and 1
    }

    private TrieNode root;

    public MaximumXOR() {
        root = new TrieNode();
    }

    public void insert(int num) {
        TrieNode node = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1; // Extract the i-th bit of the number
            if (node.links[bit] == null) {
                node.links[bit] = new TrieNode();
            }
            node = node.links[bit];
        }
    }

    public int findMaximumXOR(int num) {
        TrieNode node = root;
        int maxXOR = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1; // Extract the i-th bit of the number
            int oppositeBit = 1 - bit; // Try to find the opposite bit for maximum XOR

            if (node.links[oppositeBit] != null) {
                maxXOR = (maxXOR << 1) | 1; // Add 1 to the result
                node = node.links[oppositeBit];
            } else {
                maxXOR = (maxXOR << 1); // Add 0 to the result
                node = node.links[bit];
            }
        }

        return maxXOR;
    }

    public int findMaximumXOR(int[] nums) {
        for (int num : nums) {
            insert(num);
        }

        int maxResult = 0;

        // Find the maximum XOR for each number
        for (int num : nums) {
            maxResult = Math.max(maxResult, findMaximumXOR(num));
        }

        return maxResult;
    }

    public static void main(String[] args) {
        MaximumXOR trie = new MaximumXOR();

        // Example 1
        int[] nums1 = {3, 10, 5, 25, 2, 8};
        System.out.println("Output: " + trie.findMaximumXOR(nums1)); // Output: 28

        // Example 2
        int[] nums2 = {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        System.out.println("Output: " + trie.findMaximumXOR(nums2)); // Output: 127
    }
}
