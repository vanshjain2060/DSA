package Vansh.Recursion;

public class printNumber_inDecreasingOrder {
     
    public static void printDecreasing(int n) {
      // here this if statement is base case which
      // tell us where to stop recursion
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        int n = 10;       
        printDecreasing(n);
    }
}
