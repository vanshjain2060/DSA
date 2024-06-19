package Vansh.BitManipulation;

public class NumOfSetBit {
    public static void main(String[] args) {
         // 1st way basic way
        int n=9;
        int count=0;
        while(n>0) {
            if((n&1) == 1) {
                count +=1;
            }
            n = n>>1;
        }
        System.out.println(count);


        // to fidn the binary value of a number we have a inbuilt method
    //    String bin = Integer.toBinaryString(9);
    //    System.out.println(bin);

    }


    // 2nd way
    public static int setBit(int n) {
        int count =0;
        // while(n>0) {
        //     count++;
        //     n -= (n & -n);
        // }

        while(n>0) {
            count++;
            n= n&(n-1);
        }
        return count;
    }
}
