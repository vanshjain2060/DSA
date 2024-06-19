package Vansh.Recursion;

public class lastOccurence {
    public static int last(int arr[],int i,int key){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        } 
        return last(arr, i-1, key);
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,1,6,1};
        int n=arr.length-1;
        System.out.println(last(arr,n,0));
    }
}
