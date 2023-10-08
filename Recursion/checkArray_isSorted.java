package Vansh.Recursion;

public class checkArray_isSorted {
    public static boolean isSorted(int arr[] , int i) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,2,3,4,5};
        System.out.println(isSorted(arr, 1));
    }
}
