package Vansh.Recursion;

public class printXtoNoptimised {
    public static int optimizedpower(int x,int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedpower(x, n/2);
        int halfPowerSq = halfpower * halfpower;
        // if n is an odd number then
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedpower(2,10));
    }
}
