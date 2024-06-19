package Vansh.BinaryTrees;
import java.util.*;
// comment down to exeplaination of the code so that i can revise and understand the following code down the line in the future
public class lowestCommonAncestor {
    
    public static class Node {
        int data;
        Node left,right;

        public Node (int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }


    /**
     * This function finds the lowest common ancestor (LCA) of two nodes 'n1' and 'n2' in a binary tree.
     * It takes three parameters:
     *     - root: The root node of the binary tree.
     *     - n1: The first node.
     *     - n2: The second node.
     * 
     * The function returns the LCA of 'n1' and 'n2'.
     *
     * The function works by first finding the paths from the root to 'n1' and 'n2' using the 'getPath' function.
     * It then compares the paths from the root to 'n1' and 'n2' to find the LCA. The LCA is the first node in the
     * paths that are not the same. Once the LCA is found, it is returned.
     *
        * root: The root node of the binary tree.
        * n1: The first node.
        * n2: The second node.
    * return: The LCA of 'n1' and 'n2'.
     */
    public static Node lastCommonAnsistor(Node root, int n1, int n2) {
        // Create lists to store the paths from the root to 'n1' and 'n2'
        List<Node> path1 = new ArrayList<>();
        List<Node> path2 = new ArrayList<>();

        // Find the paths from the root to 'n1' and 'n2'
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Initialize the LCA to null
        Node lca = null;

        // Compare the paths from the root to 'n1' and 'n2' to find the LCA
        // If the paths are not the same, the LCA is the node right before they differ
        for(int i=0; i<path1.size() && i<path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                lca = path1.get(i-1);
                break;
            }
        }
        // Return the LCA
        return lca;
    }
    /**
     * This function is used to find the path from the root to a given node 'n' in a binary tree.
     * It takes three parameters:
     *     - root: The root node of the binary tree.
     *     - n: The node for which the path is to be found.
     *     - path: The list in which the path from the root to 'n' is stored.
     * 
     * The function returns true if the path is found, and false otherwise.
     * 
     * The function works by recursively traversing the binary tree. It adds the current node to the 'path' list and
     * checks if the current node is equal to 'n'. If it is, then the path is found and the function returns true.
     * If the current node is not equal to 'n', then the function recursively calls itself on the left and right subtrees
     * of the current node. If the function returns true for either of the subtrees, then the path is found and the
     * function returns true. If the function returns false for both subtrees, then the current node is not part of
     * the path and the function removes the current node from the 'path' list and returns false.
     * 
     * root: The root node of the binary tree.
     * n: The node for which the path is to be found.
     * path: The list in which the path from the root to 'n' is stored.
     * return true if the path is found, false otherwise.
     */
    public static boolean getPath(Node root, int n, List<Node> path){
        // If the root is null, then the path cannot be found.
        if(root == null) return false;

        // Add the current node to the path.
        path.add(root);

        // If the current node is equal to 'n', then the path is found.
        if(root.data == n) return true;
        
        // Recursively call the function on the left and right subtrees of the current node.
        boolean fountLeft = getPath(root.left, n, path);
        boolean fountRight = getPath(root.right, n, path);

        // If the path is found in either of the subtrees, then return true.
        if(fountLeft || fountRight) return true;
        else{
            // If the path is not found in either of the subtrees, then remove the current node from the path and return false.
            path.remove(path.size()-1);
            return false;
        }

    }









/* 
    This function finds the lowest common ancestor (LCA) of two given values n1 and n2 in a binary tree.
    It returns the node that is the LCA of n1 and n2.
    
    The function works by recursively traversing the binary tree starting from the root.
    If the current node is null or if the current node is equal to either n1 or n2,
    then the current node is returned as the LCA.
    
    If the current node is not null, the function recursively calls itself on the left and right subtrees.
    It stores the results of these recursive calls in lcaLeft and lcaRight respectively.
    
    If lcaLeft is null, then the LCA lies in the right subtree, so the current node is returned.
    If lcaRight is null, then the LCA lies in the left subtree, so the current node is returned.
    
    If both lcaLeft and lcaRight are not null, that means both left and right subtree contains one one nodes,
    then the current node is the LCA of n1 and n2.
    root The root node of the binary tree.
     * n1 The first value.
     * n2 The second value.
     * @return The node that is the LCA of n1 and n2.
*/
    public static Node LCA2(Node root, int n1, int n2) {
        // Base case
        if(root == null || root.data == n1 || root.data == n2) return root;

        // Recursive case
        Node lcaLeft = LCA2(root.left, n1, n2);
        Node lcaRight = LCA2(root.right, n1, n2);

        // If one of the subtrees is null, the LCA must be in the other subtree
        if(lcaLeft == null) return lcaRight;
        if(lcaRight == null) return lcaLeft;

        // If both subtrees contain nodes, the current node is the LCA
        return root;
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

        System.out.println(LCA2(root, 4, 5).data);
    }
}
