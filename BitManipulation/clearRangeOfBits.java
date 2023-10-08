package Vansh.BitManipulation;

public class clearRangeOfBits {
    public static int clearinRange(int n, int i, int j) {
        int a = -1<<(j+1);
        int b = ~(-1<<(i));
        int bitMask = a|b;
        return n & bitMask ;
    }
     public static void main(String[] args) {
        System.out.println(clearinRange(10, 2, 4));
     }
}
/* logic yeh hai ki aisa bitMask create karna hai jisme
   range ke alava sab value one ho and then usko & kar 
   denge number ke sath to range ke sare no 0 ban jayenge 
   and baki same he rahenge

   if we want range 2 to 4 in the number 100111010011
           so first we take create 'a' = 111111100000
                       then we make'b' = 000000000011
             the bitMask will be = a|b = 111111100011
*/ 