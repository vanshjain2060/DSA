package Vansh.BitManipulation;

public class countSetBits {
    
    public static int countsetbits(int n) {
        int count =0;
        while(n>0){
            if((n&1) != 0) {
                count++;
            }
            n= n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countsetbits(7));
    }
}
/* pahele last postion ko 1 se & karenge and check 
   karenge ki vo 1 hai ya nhi agar 1 hai to counter++
   nhi hai to counter me koee update nhi hoga
   iske baad number ko right shift karenge 1 se and fir se
   same process karenge check karenge 1 huaa to counter update 
   and fir right shift yeh process jab tak chalegi tabh tak 
   n>0 ho
  
 */