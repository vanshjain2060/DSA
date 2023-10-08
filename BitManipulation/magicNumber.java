package Vansh.BitManipulation;

public class magicNumber {
    public static void main(String[] args) {
        int n = 6 ;
        // int num = dtob(n, 0);
        
        // System.out.println(magicNum(num,1));

        int ans=0;
        int base=5;
        while(n>0) {
            int last = n&1;
            n = n>>1;
            ans +=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }

    // private static int magicNum(int num, int power) {
    //     while(num!=0)  return (num%10)*(int)Math.pow(5, power) + magicNum(num/10,power+1) ;
    //     return 0;
    // }

    // private static int dtob(int n,int pow) {
    //     while(n!=0) return (n%2)*(int)Math.pow(10, pow) + dtob(n/2, pow+1);
    //     return 0;
    // }
}
