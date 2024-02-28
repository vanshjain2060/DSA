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

    public int Search(int key) {
        Node temp = head;
        int index=0;
        while(temp != null) {
            if(temp.data == key) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int RecursionSearch(int key, Node head) {
        if(head == null) return -1;
        if(head.data == key) return 0;
        int idx = RecursionSearch(key, head.next);
        if(idx == -1) return idx;
        else return idx+1;
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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPallindrome() {
        // basae case
        if(head == null || head.next == null) return true;
        //step 1 : find the middle node
        Node mid = findMid(head);
        //step 2 : reverse the 2nd half
        Node c = mid;
        Node p = null;
        while(c != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        Node right = p;
        Node left = head;

        //step 3 : compair left data with right data
        while(left != null) {
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public void Swap(int a, int f) {
        Node ta = head, tf = head;
        for(int i=1; i<a; i++){
            ta = ta.next;
        }
        for(int i=1; i<f-1; i++){
            tf = tf.next;
        } 
        Node tan = ta.next;
        Node tfn = tf.next;

        ta.next = tfn;
        Node temp = tfn.next;
        tfn.next = tf;
        // tf.next = tan;
        tan.next = temp;
       
    }

       public static int btod(int b , int pow) {
    // while(b>0) {
    //     return ((b%10)*(int)Math.pow(2 , pow) + btod(b/10, pow+1));
    // }
    return 0;
   }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(40);
        // ll.addFirst(4);
        // ll.addFirst(5);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.display();
        // System.out.println(ll.Search(409));
        // System.out.println(ll.RecursionSearch(409, head));
        // ll.reverse();
        // ll.display();
        // System.out.println(ll.checkPallindrome());
    }
}