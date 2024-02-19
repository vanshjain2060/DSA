package Vansh.LinkedList1;

public class MainLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insrt(16, 1);
        list.display();
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        System.out.println(list.deleteLast());
        list.display();
        list.insertLast(10);
        System.out.println(list.delete(1));
        list.display();
        System.out.println(list.find(10));
    }
}