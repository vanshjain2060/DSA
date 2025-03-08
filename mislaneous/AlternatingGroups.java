// package Vansh.mislaneous;

public class AlternatingGroups {


    public static void main(String[] args) {
        int nums[] = {0,1,0,0,1,0,1};
        System.out.println(numberOfAlternatingGroups(nums, 6));
    }

    private static int numberOfAlternatingGroups(int[] nums, int k) {
        int count = 0, n = nums.length;
        if(k>nums.length) return count;
        for(int i=0; i<n; i++) {
            boolean isCount = true;
            for(int j=(i%n), kc=0; kc<k-1 ; j=((j+1)%n)) {
                if(nums[j] == nums[(j+1)%n]) {
                    isCount = false;
                    break;
                }
                kc++;
            }
            if(isCount) count++;
        }
        return count;    
    }
}
