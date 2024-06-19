package Vansh.Recursion;

public class printFactorial {
    public static int Fact(int n) {
        if(n<0){
            return -1;
        }
        if(n==0) {
            return 1;
        }
       // int fnm1 = Fact(n-1); // fnm1 is factorial of n-1
        int fn = n*Fact(n-1); // fn is factorial of n
        return fn;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Fact(n)); 
    }
}
