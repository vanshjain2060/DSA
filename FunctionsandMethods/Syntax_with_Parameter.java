package Vansh.FunctionsandMethods;
/*   syntax
returnType name (type param 1,type param 2){
    //body
    return statement;
} 
*/
import java.util.Scanner;
public class Syntax_with_Parameter {
    
    public static int calculateSum(int a, int b){ //Parameters or formal parameters
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your first number here :");
            int a = sc.nextInt();
            System.out.println("Enter your second number here :");
            int b = sc.nextInt();
            int sum = calculateSum(a, b);  //arguments or actual parameters
            System.out.println("sum is : "+ sum);
        }
    }
}
