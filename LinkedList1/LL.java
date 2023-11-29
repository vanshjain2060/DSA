package Vansh.LinkedList1;

public class LL {
    
    private Node head;
    private Node tail;
    public int size;
 

    public LL() {
        this.size =0;
    }


    
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }



    public void insertLast(int val) {
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }



    public void deleteFirst(){
        head = head.next;
        size--;
    }



    public void deleteLast() {
        Node temp = head;
        if(size==0) {
            System.out.println("list is empty");
            return;
        } 
        if(size ==1) {
            head=null;
            tail =null;
            size =0;
            return;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }



    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    private class Node {
        private int value;
        private Node next =null;

        public Node(int value) {  // constructor
            this.value = value;
        }

        public Node(int value, Node next) {   // constructor
            this.value = value;
            this.next = next;
        }
    }
}
