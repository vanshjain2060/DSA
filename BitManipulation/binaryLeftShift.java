package Vansh.BitManipulation;

public class binaryLeftShift {
    /* example lete hai 5<<2 then 
    5 ki binary value hai 000101
    is case me sabhee number 2 place aage ho jayenge
    and last ki jo empty space banee hai unko 0 se fill karenge
    */
    public static void main(String[] args) {
        System.out.println(5<<2);
    }
}
/*is ka out put aata hai yeh formule se
  a<<b = a*(2^b)
  5<<2 = 5*(2^2)
       = 5*4 
       = 20 is the answer
*/