package Vansh.Recursion;

public class PrintAllOccurence {
    public static void printOccruence(int i , int key , int arr[]){
        // Base Case 
        if(i ==  arr.length){
            return ;
        }
        // Kaam 
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        printOccruence(i+1, key, arr);
    }
    public static void main(String[] args) {
        int arr[]= {3,2,4,5,6,2,7,2,2};
        printOccruence(0, 2, arr);
    }
}
