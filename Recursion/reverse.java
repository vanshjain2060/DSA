package Vansh.Recursion;

public class reverse {
    public static void main(String[] args) {
        Reverse(3659372);
    }
    static void Reverse(int n){
        if(n == 0) return;
        System.out.print(n%10);
        Reverse(n/10);
    }
}
