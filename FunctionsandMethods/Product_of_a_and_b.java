package Vansh.FunctionsandMethods;

public class Product_of_a_and_b {
    public static int  multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5; 
        int prod= multiply(a, b);
        System.out.println("a*b="+prod);

         prod= multiply(10, 20);
        System.out.println("a*b="+prod); 
        
        prod = multiply(63, 47);
        System.out.println("a*b ="+ prod);
    }
}
