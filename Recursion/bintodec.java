package Vansh.Recursion;

public class bintodec {
    public static void main(String[] args) {
        System.out.println(btod(1001, 0)); // binary to decimal

        System.out.println(dtob(8, 0)); // decimal to binary
    }
   
    // function for Binary to Decimal
    static int btod(int n ,int power){
        while(n!=0)  return (n%10)*(int)Math.pow(2, power) + btod(n/10,power+1) ;
        return 0;
    }
    // function for Decimal to Binary
     static int dtob(int n ,int power){
        while(n!=0) return (n%2)*(int)Math.pow(10, power) + dtob(n/2,power+1) ;
        return 0;
    }

}
