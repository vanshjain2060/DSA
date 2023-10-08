package Vansh.Recursion;

public class printNumber_inIncreasingOrder {
    
    public static void printIncreasing(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncreasing(n);
    }
}  