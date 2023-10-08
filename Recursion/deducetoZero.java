package Vansh.Recursion;

public class deducetoZero {
    public static void main(String[] args) {
        System.out.println(steps(14 ,0));
    }
    static int steps(int n , int ans){
        if(n==0) return ans;
        if(n%2 != 0){
            return steps(n-1,ans+1);
        }else {
            return steps(n/2,ans+1);
        }
    }
}
