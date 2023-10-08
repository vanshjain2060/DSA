package Vansh.ArrayLists;

import java.util.ArrayList;
class Solution {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] < nums[i]) {
                list.add(nums[i]);
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}