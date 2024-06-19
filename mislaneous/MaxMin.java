package Vansh.mislaneous;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,3,65,4,8,90,56,34,57,6};
        System.out.println((Arrays.toString(Answer(arr))));
    }
    private static int[] Answer(int arr[]) {
        Arrays.sort(arr);
        int left=0 ,right=arr.length-1 ,k=0 ;
        int temp[] = new int[arr.length];
        
        while(left < right) {
            temp[k++] = arr[right--];
            temp[k++] = arr[left++];
        }
        return temp;

    }    
}
