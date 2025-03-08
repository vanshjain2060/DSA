public class firstMissingPositive {
    public static void main(String[] args) {
        int nums[] = {-1,1,5,3,4};
        System.out.println(firstMissing(nums));
    }
    public static int firstMissing(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++) {
            while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]) 
                swap(nums, i, nums[i]-1);
        }
        for(int i=0; i<n; i++) {
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}