package Vansh.ArrayLists;

import java.util.ArrayList;

public class swap {

    static void Swap(ArrayList<Integer> list , int i , int j) {
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }
    public static void main(String[] args) {
        
         ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        Swap(list,1,4);
        System.out.println(list);

    }
}
