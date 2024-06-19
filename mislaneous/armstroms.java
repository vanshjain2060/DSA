package Vansh.mislaneous;

public class armstroms {
    public static void main(String[] args) {
        int n =103 ;
        int m = n;
        int l = n;
        int count =0;
        int ans =0;
        while(n>0) {
            count++;
            n=n/10;
        }
        while(m>0) {
            ans += (int)Math.pow(m%10, count);
            m=m/10;
        }
        System.out.println(ans);
        if(ans == l) System.out.println("true");
        else System.out.println("false");
    }
}
