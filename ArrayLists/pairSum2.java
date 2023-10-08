package Vansh.ArrayLists;

import java.util.ArrayList;

// SAME QUESTION FOR THE ROTATED AND SORTED ARRAYLIST

public class pairSum2 { 
    

    static boolean ps2(ArrayList<Integer> list , int target) {
        
        int n = list.size();

        // to get the breaking point of the arraylist
        int bp = -1;  // BREAKING POINT
        for(int i=0 ; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }


        int lp=bp+1 , rp=bp;

        while(lp != rp) {
            int sum = list.get(lp) + list.get(rp) ;
            if(sum == target) return true;
            else if(sum < target) lp  =(lp+1) % n;
            rp = (n+rp-1) % n;
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(12);
        
        int target =16;
        System.out.println(ps2(list,target));
    }
}
