package Vansh.BitManipulation;

public class RangeXOR {

// this code will give the value of XOR from a to b
// and the function xor(n) will give the XOR form 0 to a

    public static void main(String[] args) {
        int a = 3;
        int b = 9;


        // this is for only to check the answer is correct or not it will give TLE
        int check =0;
        for(int i=a; i<=b; i++) {
            check ^= i;
        }
        System.out.println(check);


        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }

    // this gives XOR from 0 to a
    static int xor(int a) {
        if(a%4 == 0) return a;
        if(a%4 == 1) return 1;
        if(a%4 == 2) return a+1;
        //  if(a%4 == 3) return 0;
        return 0;
    }
}
