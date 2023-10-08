package Vansh.BitManipulation;

public class clearLast_I_Bits {
    public static int clearlastBits(int n,int i) {
        int bitMask = -1<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
       System.out.println( clearlastBits(15, 2));
    }
}
