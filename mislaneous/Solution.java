package Vansh.mislaneous;

// import java.util.Arrays;

class Solution {
    public static int reversePairs(int[] nums) {

        int count=0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                // if( (nums[i] > 0 && nums[j] > 0) && nums[i]==nums[j]) continue;
                //  if((nums[0] == nums[nums.length-1]) && nums[nums.length-1]== nums.length-2){
                //          if( nums[i]/2 > (nums[j])) count++;
                //     }else {

                   
                    long a= nums[i] < Integer.MAX_VALUE ? nums[i] : nums[i] / 2  ;

                    long b= (2*nums[j] < 0 && nums[j] > 0 )? nums[j] : nums[j]*2 ;
                    if(a>b) count++;
                    // System.out.println(a + "  " +b);
                   
                    }
            }
      if(count == 0) return 0;
        return count ;

    }

    public static void main(String[] args) {
        int nums[] = {2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647};
       System.out.println(reversePairs(nums));
   
    }
}
