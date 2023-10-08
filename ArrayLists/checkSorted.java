package Vansh.ArrayLists;

import java.util.ArrayList;

public class checkSorted {


    public static boolean checkSort(ArrayList<Integer> nums) {
        boolean inc=true , dec=true;
        for(int i=0; i<nums.size()-1; i++) {
            if(nums.get(i) > nums.get(i+1))  inc=false;
            if(nums.get(i) < nums.get(i+1))  dec=false;
        }
        return inc||dec;
    }


    public static  boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<A.size()-1; i++) {
            if (A.get(i) > A.get(i+1))
            inc = false;
            if (A.get(i) < A.get(i+1))
            dec = false;
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(6);   
        nums.add(5);   
        nums.add(4);   
        nums.add(4);  
        System.out.println(checkSort(nums));
        System.out.println(isMonotonic(nums));
    }
}
