package Vansh.mislaneous;

import java.util.Arrays;

class Solution {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int ans =-10000000;
        if(nums.length == 1) return nums[0];

        if(nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i+1] != nums[i]) {
                ans = nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,1,-1,3};
       System.out.println(singleNumber(nums));
   
    }
}
