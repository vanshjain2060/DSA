package Vansh.BitManipulation;

public class oddEven {
    public static void oddeven(int n) {
        int bitMassk=1;
        if((n & bitMassk) ==0) {
           System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddeven(52);
        oddeven(11);
    }
}
