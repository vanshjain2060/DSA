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



    public void insrt(int val , int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = get(index);
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    


    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
       
            tail.next = node;
            tail = node;
            
        size++;
    }



    public void deleteFirst(){
        head = head.next;
        size--;
    }



    public int delete(int index){
        if(index == 0) {
            deleteFirst();
        }else if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }



    public int deleteLast() {
        // Node temp = head;
        if(size==0) {
            System.out.println("list is empty");
        } 
        else if(size ==1) {
            head=null;
            tail =null;
            size =0;
        }
        Node temp=get(size-2);
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;

        return val;
    }



    public int find(int value){
        Node temp = head;
        for(int i=0; i<size; i++) {
            if(temp.value == value){
                return i;
            }
            temp= temp.next;
        }
        return -1;
    }

    

    public Node get(int index) {
        Node temp = head;
        for(int i=0; i<index; i++) {
            temp=temp.next;
        }
        return temp;
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
