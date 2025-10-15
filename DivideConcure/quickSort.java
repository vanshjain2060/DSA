public class quickSort {
    static void quicksort(int arr[], int si, int ei) {
        if (si >= ei)
            return;
        int pivotIndex = partition(arr, si, ei);
        quicksort(arr, si, pivotIndex - 1); // this is for left part
        quicksort(arr, pivotIndex + 1, ei); // this is for right part
    }

    static int partition(int arr[], int si, int ei) {
        int i = si - 1; // i+1 will be the next place we need to insert element which is <= pivot element

        for (int j = si; j < ei; j++) {
            if (arr[j] <= arr[ei]) { // then swap arr[j] with arr[i]
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 4, 5 };
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
