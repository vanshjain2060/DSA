package Vansh.LinkedList1;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
   

    public void addFirst(int data) { 
        // s1 create new node
        Node newNode = new Node(data);
        // base case
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //s2 newNode next = head
        newNode.next = head;
        //s3 head will be at newNode
        head = newNode;
    }


    public void display(){
        Node temp = head; 
        System.out.print("START->");
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }


   
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(40);
        ll.display();
    }
}
