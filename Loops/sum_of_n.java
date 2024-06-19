package Vansh.Loops;
import java.util.*;
public class sum_of_n{
     public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
         System.out.println("enter a number");
           int n = sc.nextInt();
           int i =1;
           int sum =0;
           while(i<=n){
           sum += i;  
           i++;   
           }System.out.println("sum is = " + sum);
      } 
     }
}
