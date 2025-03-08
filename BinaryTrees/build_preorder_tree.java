import java.util.LinkedList;
import java.util.*;
public class build_preorder_tree {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preOrderTraversal(Node root) {
            if(root == null) {return;}
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public void inOrderTraversal(Node root) {
            if(root == null) return;
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

        public void postOrderTraversal(Node root) {
            if(root == null) return;
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
        
        public void levelOrder(Node root) {
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();

                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) q.add(currNode.left);
                    if(currNode.right != null) q.add(currNode.right);   
                }
            }
        }
    
        public int height(Node root) {
            if(root == null) return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public int countNode(Node root) {
            if(root == null) return 0;
            int leftCount = countNode(root.left);
            int rightCount = countNode(root.right);
            return leftCount + rightCount + 1;
        }
    
        public int sum(Node root) {
            if(root == null) return 0;
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return (leftSum + rightSum + root.data);
        }
    
        public int diameter(Node root) { // O(n^2)
            if(root == null) return 0;

            int leftDia = diameter(root.left);
            int rightDia = diameter(root.right);
            int leftHei = height(root.left);
            int rightHei = height(root.right);

            int selfDia = leftHei + rightHei + 1;

            return Math.max(selfDia , Math.max(leftDia, rightDia));
        }
    
        
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
        System.out.println("Number of nodes present in the tree is: " + tree.countNode(root));
        System.out.println("Height of the root Node of the tree is: " + tree.height(root));
        System.out.println("Total sum of all the Nodes of the tree is: " + tree.sum(root));
        System.out.println("Diameter of the tree is: " + tree.diameter(root));
    }
}
