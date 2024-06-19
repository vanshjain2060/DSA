package Vansh.TREES;

public class BinarySearchTree {
    
    public class Node {
        private int value , height;
        private Node left , right;

        public Node(int value) {
            this.value = value;
        }

        public int getvalue() {
            return value;
        }
    }

    private Node root;


    public int height(Node node) {
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void display() {
        display(root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if(node==null) return;
        System.out.println(details + node.getvalue());

        display(node.left, "Left child of " + node.getvalue() + " : ");
        display(node.right, "right child of " + node.getvalue() + " : ");
    }


    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.value) {
            node.left = insert(value, node.left);
        }
        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left) , height(node.right)) + 1;

        return node;
    }


    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if(node == null) return true;
        
        return Math.abs( (height(node.left) - height(node.right)) )  <= 1  &&  balanced(node.left) && balanced(node.right);
    }

// this will takes the input as array and insert elements of array into the tree using insert function 
    public void populate(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            insert(nums[i]);
        }
    }


    // populate function for the sorted array as input
    public void populateSorted(int nums[]) {
        populateSorted(nums, 0 , nums.length);
    }
    private void populateSorted(int[] nums, int start, int end) {
        if(start >= end) { return; }

        int mid = (start + end) / 2;
        // insert middle element and then call for left and right function call
        insert(nums[mid]);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int nums[] = {1, 2, 3, 4, 5 ,6, 7 ,8, 9};
        tree.populateSorted(nums);
        tree.preOrder();
        System.out.println();
        tree.InOrder();
        System.out.println();
        tree.postOrder();
    }
 

// TRAVERSALS

    public void  preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if(node == null) return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    
    public void  InOrder() {
        InOrder(root);
    }
    private void InOrder(Node node) {
        if(node == null) return;

        InOrder(node.left);
        System.out.print(node.value + " ");
        InOrder(node.right);
    }


    public void  postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

}