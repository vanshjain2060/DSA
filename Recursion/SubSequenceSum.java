import java.util.ArrayList;
import java.util.Arrays;

public class SubSequenceSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int sum = 2;
        Boolean[][] dp = new Boolean[arr.length][sum+1];
        getAllSequence(arr, 0, new ArrayList<>(), sum, dp);

        int[][] memo = new int[arr.length][sum+1];
        for(int[] temp : memo) Arrays.fill(temp, -1);
        System.out.println(getSequenceCount(arr, 0, 0, sum, memo));
    }

    public static boolean getAllSequence(int[] arr, int i, ArrayList<Integer> curr, int sum, Boolean[][] dp) {
        if(i == arr.length) {
            if(sum == 0) {
                System.out.println(curr);
                return true;
            }
        }
        if(sum < 0 || i >= arr.length) return false;
        if(dp[i][sum] != null) return dp[i][sum];
        
        curr.add(arr[i]);
        boolean include = getAllSequence(arr, i+1, curr, sum-arr[i], dp);
        curr.remove(curr.size()-1);

        boolean exclude = getAllSequence(arr, i+1, curr, sum, dp);
        
        return dp[i][sum] = include || exclude;
    }

    
    public static boolean getFirstSequence(int[] arr, int i, ArrayList<Integer> curr, int sum, Boolean[][] dp) {
        if(i == arr.length) {
            if(sum == 0) {
                System.out.println(curr);
                return true;
            } else return false;
        }
        if(sum < 0 || i >= arr.length) return false;
        if(dp[i][sum] != null) return dp[i][sum];
        
        curr.add(arr[i]);

        boolean include = getFirstSequence(arr, i+1, curr, sum-arr[i], dp);
        if(include) return true;
        
        curr.remove(curr.size()-1);

        boolean exclude = getFirstSequence(arr, i+1, curr, sum, dp);
        if(exclude) return true;

        return dp[i][sum] = include || exclude;
    }
    

    public static int getSequenceCount(int[] arr, int i, int curr, int sum, int[][] dp) {
        if(i == arr.length) {
            if(sum == 0) {
                return 1;
            } else return 0;
        }
        if(sum < 0 || i >= arr.length) return 0;
        if(dp[i][sum] != -1) return dp[i][sum];
        
        int include = getSequenceCount(arr, i+1, curr+arr[i], sum-arr[i], dp);
        int exclude = getSequenceCount(arr, i+1, curr, sum, dp);

        return dp[i][sum] = include + exclude;
    }
}