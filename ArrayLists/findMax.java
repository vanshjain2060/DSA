package Vansh.ArrayLists;

import java.util.ArrayList;

public class findMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<list.size() ; i++) {
            // max = max<list.get(i) ? list.get(i) : max;
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max Element is : " + max);
    }
}
