package DSA.BinarySearch;

public class FirstLast {
    public static void main(String[] args) {
    int[] arr = {1,4,7,7,7,8,13,15};
    int target =15;
    int ans[] = SearchInRange(arr, target);
    System.out.println("["+ans[0] + ", " + arr[1] +"]");
    }


    public static int[] SearchInRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = Search(nums, target, true);
        ans[1] = Search(nums, target, false);
        return ans;
    }

    public static int Search(int[] arr, int target , boolean findStarIndex) {
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) return -1;
        int ans =-1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else {
                ans = mid;
                if(findStarIndex) end = mid-1;
                else start = mid+1;
            }
        }
        return ans;
    }

}
