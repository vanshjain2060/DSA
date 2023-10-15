package DSA.BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 10, 8};
        int m=2;
        System.out.println(Find(arr, m));
    }

    public static int Find(int arr[] ,int m) {
        int start =0;
        int end =0;
    
        for(int i=0; i<arr.length; i++) {
            start = Math.max(start, arr[i]);  // Basically ar the end of this loop start will have value of the meximum element of the array
            end += arr[i]; // Basically when the loop is ended end will have the sum of all the elements of the array
        }

        // Binary Search
        while(start<end) {
            // try for the middle as potential ans
            int mid = start + (end - start)/2;
            
            // calculate how many peices you can divide this in with this max sum
            int sum=0;
            int peices=1;
            for(int i=0; i<arr.length; i++){
                if(sum + arr[i] > mid) {
    // we cannot add this in this subarray, make new one
    // say we add this num in new subarray, then sum = num
                    sum = arr[i];
                    peices++;
                }else {
                    sum += arr[i];
                }
            }

            if(peices > m) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return end;  // here start == end;
    }
}
