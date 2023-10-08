package Vansh.Recursion;

public class fibonacciNumbers {
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        // int fnm1 = fib(n-1);
        // int fnm2 = fib(n-2);
        // int fn = fib(n-1) + fib(n-2);   //fnm1 + fnm2;
        return fib(n-1) + fib(n-2);

        // if(n==1 || n==0){
        //     return 1;
        // }
        //  return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=31;
        System.out.println(fib(n));
    }
}
