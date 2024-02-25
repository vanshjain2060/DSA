package Vansh.LinkedList2;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { 
        // s1 create new node
        Node newNode = new Node(data);
        size++;
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

    public void addLast(int data) { 
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addAt(int data,  int i){
        if(i==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int j=0; j<i-1; j++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public int removeFirst(){
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
   
    public void removeLast() {
        if(size == 1 || size == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        System.out.println(val);
        size--;
    }
    
    public void reverse(){
        Node p = null;
        Node c = head;
        Node n;
        tail = c;
        while(c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
       head = p;
    }

    public void display(){
        Node temp = head; 
        if(temp == null) {
            System.out.println("Linked List is Empty");
        }
        System.out.print("START->");
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println(size);
    }

    public void RemoveNthFromEnd(int n) {
        // calcutating the size of the linked list
        Node temp = head;
        int sizee=0;
        while(temp != null) {
            temp = temp.next;
            sizee++;
        }
        if(n>sizee){
            System.out.println("Node not Exist");
            return;
        }
        if(n == sizee){
            head = head.next;
            return;
        }
        //deletion
        temp = head;
        for(int i=1; i<sizee-n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return;
    } 
   
    // this is special find mid function for merge sort 
    // in which fast is stared from head.next so that
    // all the time we get the mid node which is the last
    // node of the left linked list
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next =head;
        // // head.next.next.next = head.next;
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // 5->4->3->2->1
        ll.display();
        ll.zigZag();
        ll.display();
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
    }



    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public  void removeCycle() {
        // detect the cycle
        Node s = head;
        Node f = head;
        boolean cycle = false;
        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if(s == f) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) return;

        // find meeting point
        s = head;
        Node prev = f;
        while(s != f) {
            s = s.next;
            prev = f;
            f = f.next; 
        }
        // remove cycle by prev.next = null
        prev.next = null;
    }

    public  Node mergeSort(Node head) {
        // Base Case
        if(head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = findMid(head);

        // left and right merge sort calls
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight =  mergeSort(rightHead);
        
        // Merge 
        return merge(newLeft, newRight);
    }

    public static Node merge(Node h1, Node h2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while(h1 != null && h2 != null) {
            if(h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        while(h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while(h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public void zigZag() {
    //    //step 1 : find the middle node
    //     Node s = head;
    //     Node f = head.next;
    //     while(f != null && f.next != null) {
    //         s = s.next;
    //         f = f.next.next;
    //     }
    //     Node mid = s;
    Node mid = findMid(head);

        //step 2 : reverse the 2nd half
        Node c = mid.next;
        mid.next = null;
        Node p = null;
        while(c != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        Node right = p;
        Node left = head;
        Node nl , rl;
       
        while(left != null && right != null) {
            nl = left.next;
            rl = right.next;

            left.next = right;
            right.next = nl;

            left = nl;
            right = rl;
        }
    }
    
}
