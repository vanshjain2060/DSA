package Vansh.mislaneous;

public class SortedAndRoatated {
    public static boolean check(int[] nums) {
        int n=nums.length;
        int bp=-1;
        for(int i=n-1; i>0; i--) {
            if(nums[i-1] > nums[i]) {
                bp=i;
                break;
            }
        }
         System.out.println(bp);
        if(bp == -1) return true;
        if(nums[n-1] > nums[0]) return false;

        for(int i=bp-1; i>0; i--) {
            if(nums[i-1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,4,1,2,6,2};
        System.out.println(check(nums));
    }
}
