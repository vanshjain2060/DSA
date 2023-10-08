package Vansh.LinkedList1;

public class LinkedList {
    static class Node {
        int data;
        Node next;    // internal pointer

        public Node(int data) {      // Constructor
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;

    public void addFirst(int data) { 
        /* is line me static nhi like hai q ki staic field 
        ke andar sirf staic he declare  ho sakta hai to vo 
        by default he staic le  lega  agar kuch  nhi likha 
        huaa hai to */

        // Step1 - create new node
        Node newNode = new Node(data);
        
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // Step2 - newNode next = head
        newNode.next = head;

        // step3 - head = newNode
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(221);
        System.out.println(ll.tail.data);
    }
}
