package Vansh.BitManipulation;

public class binaryRightShift {
    /* yeh just leftshift ka opposite hai
       isme number ko right me shift karenge
       and jo space starting me enpty hongi
       unko 0 se fill kargenge
    */

    public static void main(String[] args) {
        System.out.println(6>>1);
    }
}
/*  here the formula comes out to be
 a>>b = a/(2^b)
 6>>1 = 6/(2^1)
      = 6/2
      = 3 is the answer
*/