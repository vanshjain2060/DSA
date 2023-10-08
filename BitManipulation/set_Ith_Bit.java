package Vansh.BitManipulation;

public class set_Ith_Bit {
      public static int setIthBit(int n , int i) {
          int bitMask = 1<<i;
          return n|bitMask ;
      }
      public static void main(String[] args) {
        System.out.println(setIthBit(10, 2 ));
      }
}
/* Ith position ko set karna hai iska matlab
  Ith position pe 1 hona cahiye answer me
  to iske liye ham ek bitMask bnaege jisme sirf
  Ith place par 1 hoga baki sare position par 
  zero hoga and then usko original number ke sath
  OR kardenge .
  agar Ith position pe 1 hoga to OR karne par
  koee change nhi aaega .
  agar nhi huaa to 1 se OR hone ke baad 1 ho he jayega.
 */