import java.util.*;
import java.util.LinkedList;
public class printKthLevel {
    public static class Node {
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    /**
     * KthLevel function prints the kth level of the binary tree.
     * 
     * root is The root node of the binary tree.
     * k is The level of the tree to print.
     */
    public static void KthLevel(Node root, int k) {
        // Base case: if root is null, return
        if(root == null) return;
        
        // Base case: if k is 1, print root and return
        if(k == 1) {
            System.out.print(root.data + " ");
            return;
        }
        
        // Create a queue and enqueue root and a null pointer
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        // Loop until queue is empty
        while(!q.isEmpty()) {
            // Remove and store front of queue
            Node curr = q.remove();
            
            // If the curr node is null, decrement k and check if k is 1
            if(curr == null) {
                if(--k == 1) {
                    // If k is 1, print remaining nodes in queue until null pointer is found
                    while(q.peek() != null) System.out.print(q.remove().data + " ");
                    return;
                }
                // If queue is empty, break loop
                if(q.isEmpty()) break;
                // Enqueue a null pointer
                q.add(null);
            }else {
                // If curr node is not null, enqueue left and right children if they exist
                if(curr.left != null)  q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
    }



    
    /**
     * Recursive function to print the data of nodes at the kth level of the binary tree.
     * 
     * root is the root node of the binary tree.
     * level is the current level of the tree.
     * k is the level of the tree to print.
     */
    public static void kLevel(Node root , int level, int k) {
        // Base case: if root is null, return
        if(root == null) return;
        
        // If the current level is equal to k, print the data of the root node and return
        if(k == level) {System.out.print(root.data + " "); return;}
        
        // Recursively call the function for the left and right children of the root node at the next level
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }



   

    public static void main(String[] args) {
        /*
                        1
                       / \
                      2   3 
                     / \  / \
                    4  5  6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kLevel(root, 1, 2);
        System.out.println();
        KthLevel(root, 2);

    }
}
