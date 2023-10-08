package Vansh.BitManipulation;

public class updateTheBit {
  
    // to clear the Bit
    public static int clearBit(int n , int i) {
        int bitMask = ~(1<<i); 
        return n & bitMask;
     }
    // to set the Bit
     public static int setIthBit(int n , int i) {
        int bitMask = 1<<i;
        return n|bitMask ;
    }
    // to update the Bit by basic logic 
    /* zero cahiye  to Ith position ko clear kardo
      and one cahiye to Ith position ko set kardo
     */
    public static int update1(int n, int i, int newBit) {
    if(newBit == 0){
      return clearBit(n, i);
    }
    else{
        return setIthBit(n, i);
        }
    }
     
    // update by method 2
    /* pahele Ith Bit ko clear kardo then jo cahiye
       usee Ith position pe le jaoo and OR kardo
     */
    public static int update2(int n, int i, int newBit) {
        n = clearBit(10, 1);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
       //call the update function 1 or 2 and get the answer
       System.out.println(update2(10, 1, 0)); 
      
    }
}

