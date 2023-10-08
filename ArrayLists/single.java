package Vansh.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class single {

   public static ArrayList<Integer> isSingle(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.size()-1;

        if( nums.get(0) != nums.get(1) && nums.get(0)+1 != nums.get(1) ) {
            ans.add(nums.get(0));
        }
        for(int i=1; i<n; i++) {
            int currNum=nums.get(i);
            if(currNum != nums.get(i-1) && currNum != nums.get(i+1) && 
              currNum != nums.get(i+1)-1 && currNum != nums.get(i-1)+1) {
                ans.add(nums.get(i));
            }
        }
        
        if( nums.get(n) != nums.get(n-1) && nums.get(n)-1 != nums.get(n-1) ) {
            ans.add(nums.get(n));
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        System.out.println(isSingle(nums));   
    }
}
