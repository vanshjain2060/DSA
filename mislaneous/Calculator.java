package Vansh.mislaneous;
import java.util.*;
public class Calculator {
   public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("enter your first number");
      int n1 = sc.nextInt();
  System.out.println("enter your second number");
      int n2 = sc.nextInt();
      System.out.println("enter your operator");
      char operator= sc.next().charAt(0);
      switch (operator){
        case '+': System.out.println(n1+n2);  
        break;
        case '-': System.out.println(n1-n2);  
        break;
        case '*': System.out.println(n1*n2);  
        break;
        case '/': System.out.println(n1/n2);  
        break;
        case '%': System.out.println(n1%n2);  
        break;
 default : System.out.println("Wrong Operator");
          }
    }
      }
  
}

   
