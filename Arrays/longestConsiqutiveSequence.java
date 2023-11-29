package Vansh.Arrays;
import java.util.Arrays;
public class longestConsiqutiveSequence {
    
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count =1;
        if(nums.length == 0) return 0;
        int maxcount=1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] + 1 == nums[i+1]) count++;
            maxcount = Math.max(maxcount, count);
            if(nums[i] +1 != nums[i+1]) count=1;
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,2,1};
    }
}
    
