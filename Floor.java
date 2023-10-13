package DSA.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 11, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of largest no <= target
    static int floor(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target < arr[0]) return -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])  end = mid - 1;
            else if (target > arr[mid])  start = mid + 1;    
            else  return mid;
        }
        return end;
    }
}
