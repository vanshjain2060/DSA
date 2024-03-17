package Vansh.TREES;

public class AVLtree {
    
    public class Node{
        private int value, height;
        private Node left, right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }        
    }

    private Node root ;

    public AVLtree() {

    }

    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if(node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void populate(int nums[]) {
        for(int i : nums) {
            insert(i);
        }
    }

    
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
        
    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        
        int mid = (start + end) / 2;
        
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }
        

    public void display() {
        display(root, "Root Node :");
    }
    private void display(Node node, String delails) {
        if(node == null) return ;
        System.out.println(delails + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "right child of " + node.value + " : ");
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
        return rotate(node); // if will fix the tree if it is not balanced
    }

    private Node rotate(Node node) {
        // condition of left heavy
        if(height(node.left) - height(node.right) > 1) {
            // left left case
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            // left right case
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // condition of right heavy
        if(height(node.left) - height(node.right) < -1) {
            // right right case
            if(height(node.right.left) - height(node.right.right) < 0) {
                return leftRotate(node);
            }
            // right left case
            if(height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left) , height(p.right)) + 1;
        c.height = Math.max(height(c.left) , height(c.right)) + 1;

        return c;
    }
    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left) , height(p.right)) + 1;
        c.height = Math.max(height(c.left) , height(c.right)) + 1;

        return p;
    }


    public static void main(String[] args) {
        AVL tree = new AVL();

        for(int i=0; i<1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.balanced());
        System.out.println(tree.height());
    }

}
