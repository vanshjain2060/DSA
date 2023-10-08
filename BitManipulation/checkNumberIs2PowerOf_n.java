package Vansh.BitManipulation;

public class checkNumberIs2PowerOf_n {
    public static boolean isPowerOfTwo(int n) {
       int bitMask = n&(n-1);
        if(bitMask ==0) {
            return true;
        } return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));

    // JUST USING DIFFERNT SYNTAX
        // int num=16;
        // boolean ans = (num&(num-1)) == 0;
        // System.out.println(ans);
    }
} 
/* let take example of 8
   8 will be represented as 1000
      and (8-1) = 7 will be 0111
      in dono ka & lenge to hamesha 0 aaeaga
      aisa he har 2^n wale number ke sath hoga
 */