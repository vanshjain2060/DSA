package Vansh.BasicSorting;

public class CountSorting {
    public static void countingSort(int arr[]) {
        int largest =Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[]= new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting
        int j =0;
        for(int i =0; i<count.length; i++){
           while(count[i]>0){
            arr[j] =i;
            j++;
            count[i]--;
           } 
        }
    }
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,6,2,8,7,4,5,3,1};
          countingSort(arr);
          printArr(arr);
    }
}
/* count sort ka use sirf tabh use karna cahiye
 jab same numbers count me bhoot jada ho par range
 or the numbers small ho ya jada badi na ho */ 