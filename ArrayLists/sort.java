package Vansh.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(13);
        list.add(3);

        System.out.println(list);

        // to sort in assending order
        Collections.sort(list);             // we use sort function to sort the list which is inside the Collections class
       
        System.out.println(list);

        


        // to sort list in decending order

        Collections.sort(list, Collections.reverseOrder());
        /* Collections.reverseOrder()  is a comparator which we are using to decide the logic of the function */
        System.out.println(list);
    }
}
