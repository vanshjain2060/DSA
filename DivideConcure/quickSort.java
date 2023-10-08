package Vansh.DivideConcure;

public class quickSort {

    static void quicksort(int arr[] ,int si ,int ei){
        if(si >= ei) return;
        int pivotIndex = partition(arr, si, ei);
        quicksort(arr, si, pivotIndex-1); // this is for left part 
        quicksort(arr, pivotIndex+1, ei); // this is for right part
    }

    static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1 ; // this is made to make space for elements smaller than pivot 
        
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){ // then swap arr[j]  with arr[i]
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei]; // basically arr[ei] = pivot
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
