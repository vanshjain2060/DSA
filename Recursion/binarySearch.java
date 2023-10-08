package Vansh.Recursion;

public class binarySearch {
    static int binSearch(int[] arr , int key, int start , int end) {
        while(start<=end){
        int mid = start+(end-start)/2;
        if(key==arr[mid]) return mid;
        if(key<arr[mid]) return binSearch(arr, key, start, mid-1);
        else return binSearch(arr, key, mid+1, end);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,13,14,19,21,27};
        System.out.print(binSearch(arr, 19, 0, arr.length));
    }
}
