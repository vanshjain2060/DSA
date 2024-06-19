package Vansh.FunctionsandMethods;

public class Function_Overloading {
     // Function 1 calcu sum of 2 num
    public static int sum(int a , int b){
        return a+b;
} 
     // Function 2 calcu sum of 3 num
     public static int sum(int a,int b, int c) {
        return a+b+c;
     }
public static void main(String[] args) {
    System.out.println(sum(3,4));
    System.out.println(sum(6,8,3));
}
}
