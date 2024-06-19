package Vansh.LinkedList1;

public class DLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            tail = nn;
            size++;
            return;
        }
        head.prev = nn;
        nn.prev = null;
        nn.next = head;
        head = nn;
        size++;
    }

    public void addLast(int data) {
        if(head == null) {
            addFirst(data);
            return;
        } 
        Node nn = new Node(data);
        tail.next = nn;
        nn.next = null;
        nn.prev = tail;
        tail = nn;
        size++;
    }
    
    public int removeFirst() {
        int del ;
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MAX_VALUE;
        } 
        if(head == tail) {
            del = head.data;
            head = tail = null;
            size--;
            return del;
        }
        del = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return del;
    }

    public int removeLast() {
        if(head == null || head == tail) {
            return removeFirst();
        }
        int del;
        del = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return del;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node nxt ;
        tail = curr;
        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            curr.prev = nxt;
            prev = curr;
            curr = nxt;
        }
        head = prev;
    }

    public void Print(){
        Node temp = head; 
        if(temp == null) {
            System.out.println("Linked List is Empty"); return ;
        }
        System.out.print("START->");
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println(size);
    }

    public void Display(){
        Node temp = tail; 
        if(temp == null) {
            System.out.println("Linked List is Empty"); return ;
        }
        System.out.print("START->");
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("END");
        System.out.println(size);
    }
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addLast(2);
        dll.addLast(3);
        dll.addFirst(1);
        dll.addLast(4);
        dll.Print();
        dll.reverse();
        dll.Print();
    }
}
