package Vansh.Recursion;

public class firstOccurence {
    public static int first(int arr[],int i ,int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return first(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,1,2,4,5,3};
        System.out.println(first(arr, 0, 6));
    }
}
