package Vansh.Arrays;
// all the edge cases are covered
public class kadanes {
    public static int maxSUM(int arr[],int n){
    //    int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //      if(arr[i]>largest){
    //        largest = arr[i];
    //       } 
    //      } 
         
        //  if(largest<0){
        //      return largest;
        //  }
            int sum=0;
            int maxSum=Integer.MIN_VALUE;
             for(int i=0; i<n; i++) {
                 sum = sum + arr[i];
                 if(maxSum<sum) {
                     maxSum=sum;
                 }
                 if(sum<0) {
                     sum=0;
                 }
           }
             return maxSum;
     }
     public static void main(String[] args) {
        int arr[] = {-2, -3, -1 ,-5, -4};
        int n = arr.length;
        System.out.println(maxSUM(arr, n));
     }
}

