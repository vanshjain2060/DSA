package Vansh.ArrayLists;

import java.util.ArrayList;

public class pairSum {

// BRUTE FORCE APPROACH     [Time Complexity = O(n^2)]
    static boolean pair(ArrayList<Integer> list , int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target)  return true;
            }
        }
        return false;
    } 



// 2 POINTER APPROACH  [Time Complexity = O(n)]
// APPLICABLE WHEN LIST IS SORTED
    static boolean PAIR(ArrayList<Integer> list , int target) {
        int lp=0 , rp=list.size()-1 ;
        
        while(lp<rp) {
            int sum = list.get(lp) + list.get(rp);
            if( sum  ==  target )  return true;
            else if( sum < target )  lp++;
            rp--;
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=6; i++) {
            list.add(i*1);
        } 
        int target = 5;
        System.out.println(pair(list, target));
        System.out.println(PAIR(list , target));
    }
}
