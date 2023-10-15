package DSA.BinarySearch;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 3, 6, 2, 1};
        System.out.println(FindPeak(arr));
    }

    static int FindPeak(int arr[]) {
        int s = 0;
        int e = arr.length-1;
        
        while(s<e) {
            int m = s+(e-s)/2;
            if(arr[m] < arr[m+1]) s=m+1;
            else e=m;
        }
        return arr[e]; // return e since s=e
    }
}
