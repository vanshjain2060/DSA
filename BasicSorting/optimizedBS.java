package Vansh.BasicSorting;

public class optimizedBS {
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5};
        optBubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void optBubbleSort(int arr[]){
        for(int turn =0 ; turn < arr.length ; turn ++) {
            boolean swapped = false;
            for(int j=0 ; j < arr.length-1-turn ; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
    }
}
