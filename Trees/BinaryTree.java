package Vansh.TREES;
import java.util.*;
public class BinaryTree {

    private static class Node{
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    //insert elements4
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean leftInsert = sc.nextBoolean();
        if(leftInsert) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        } 
        System.out.println("Do you want to enter right of " + node.value);
        boolean rightInsert = sc.nextBoolean();
        if(rightInsert) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right); // 
        }
    }

    public void display() {
        display(root , "");
    }
    private void display(Node node, String indent) {
        if(node == null) return;
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right , indent + "\t");
    }


    public void preetyDisplay() {
        preetyDisplay(root, 0);
    }

    public void preetyDisplay(Node node, int level) {
        if(node == null) return;
        preetyDisplay(node.right, level+1);
        if(level != 0) {

            // this is just to make some space at the terminal so that it look 
            // like all the levels are seperated from each other by some space
            for(int i=0; i<level-1; i++) {
                System.out.print("|\t\t");
            }
            // this is used to show the link between different node of different levels
            System.out.println("|-------->" + node.value);

        }else { // level 0 means there is only root node there which is going to be printed
            System.out.println(node.value);
        }
         
        preetyDisplay(node.left, level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.preetyDisplay();
    }
}
