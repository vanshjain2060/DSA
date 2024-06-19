package Vansh.Recursion;

public class printXtopowerN {
    public static int XtoN(int x , int n){
        if(n==0){
            return 1;
        }
        // int ans = x*(XtoN(x,n-1));
        // return ans;
        return x*XtoN(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(XtoN(2,10));
    }
}                       
