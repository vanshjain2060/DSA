package Vansh.BasicSorting;

public class SelectionSorting {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos =i;
            for(int j=i; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[i] ;
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
     }

  public static void main(String[] args) {
    int arr[] = {6,2,1,8,7,4,5,3,1};
    selectionSort(arr);
    printArr(arr);
  }
}
