package Vansh.BitManipulation;

public class numberOfBit {
    // Time Complexity will by log(n)
    public static void main(String[] args) {
        int n=34567;
        int base=16;
        int ans = (int)(Math.log(n)/Math.log(base)) + 1;
        System.out.println(ans);
    }
}
