package Vansh.ArrayLists;

import java.util.*;

public class syntax  {
   
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Float> list3 = new ArrayList<>();


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        
        // Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(1, 8);
        System.out.println(list);



        // to find the size of the list
        System.out.println(list.size());



        // Get operation
        // int element = list.get(2);
        // System.out.println(element);



        // Delete operation
        // list.remove(1);
        // System.out.println(list);



        // Set operation
        // list.set(3, 9);
        // System.out.println(list);



        // Contains element
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));
    }
}


