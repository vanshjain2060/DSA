package Vansh.BitManipulation;

public class binaryRightShift {
    /* yeh just leftshift ka opposite hai
       isme number ko right me shift karenge
       and jo space starting me enpty hongi
       unko 0 se fill kargenge
    */

    public static void main(String[] args) {
        // int a=51;
        // // a>>=1;
        // // a =a>> 2;
        // a /=4;
        // System.out.println(a);
        // System.out.println(51>>2);
        // System.out.println(12<<2);
        int a = -2147483648;
        int b= -1;
        System.out.println(a/b);
    }
}
/*  here the formula comes out to be
 a>>b = a/(2^b)
 6>>1 = 6/(2^1)
      = 6/2
      = 3 is the answer
*/