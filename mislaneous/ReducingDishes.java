// package Vansh.mislaneous;
import java.util.*;
public class ReducingDishes {
    public static void main(String[] args) {
        int[] nums = {-1,-8,-9,0,5};
        Arrays.sort(nums);     //O(nlog(n))

        //O(n) with extra space of dp[][] array
        System.out.println(maxSatisfaction(nums));   


        //O(n) with constant space
        int n = nums.length-1, sum =0, temp_sum = 0;
        while(n>=0){
            temp_sum+=nums[n--];
            if(temp_sum <0) break;
            sum+=temp_sum;
        }
        System.out.println(sum);


        // O(n^2) with constant space
        int maxi = 0, m = nums.length;
        for(int i=0; i<m; i++) {
            int time = 1, currSum = 0;
            for(int j=i; j<m; j++) {
                currSum += nums[j]*time++;
            }
            maxi = Math.max(maxi, currSum);
        }
        System.out.println(maxi);
    }

    private static long maxSatisfaction(int[] nums) {
        Arrays.sort(nums);
        long[][] dp = new long[nums.length][nums.length+1];
        for(int i=0; i<nums.length; i++) {
            Arrays.fill(dp[i] , -1);
        }
        return solve(nums, dp, 0 , 1);
    }

    private static long solve(int[] nums, long[][] dp, int i, int time) {
        if(i == nums.length) return 0;
        if(dp[i][time] != -1) return dp[i][time];
        long take = (nums[i]*time) + solve(nums, dp, i+1, time+1);
        long not_take = solve(nums, dp, i+1, time);
        return dp[i][time] = Math.max(take, not_take);
    }
}
