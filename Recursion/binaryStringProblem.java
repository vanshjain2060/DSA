package Vansh.Recursion;

public class binaryStringProblem {
    public static void printBinary( String str , int lastPlace , int n){
        // Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // Kaam
        printBinary(str+"1" , 1, n-1);
        if(lastPlace == 1){
            printBinary(str+"0", 0, n-1);
        }
    }
    public static void main(String[] args) {
        printBinary(new String (""), 1, 3);
    }
}
