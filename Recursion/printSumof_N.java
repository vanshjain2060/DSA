package Vansh.Recursion;

public class printSumof_N {
    
    public static int printSum(int n) {
        if(n==1) {
            return 1;
        }
        int sum = n + printSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printSum(n));
    }
}
