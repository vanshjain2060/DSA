package Vansh.BitManipulation;

public class get_Ith_Bit {
    public static int getIthbit(int number , int i) {
        int bitMask = 1<<i ;
        if((number & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthbit(10, 3));
    }
}
/*  logic yeh hai ki jaise odd even pta kiya tha last question
    vo 1st place par he check kiya tha but is question me I^th 
    place ki bit ko check karna hai isliye 1 ko I time se left 
    shift karke 1 ko I^th place par laee hai taki usko compair
    kar sake I^th bit se
*/