package Vansh.Loops;
import java.util.*;
public class loops_question_3 {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your number here");
        int n = sc.nextInt(); 
        int f =1;
        int m =1;
   while(m<=n){
         f *=m ;
         m++;
   }System.out.println( "factorial of the number " + n + " is = "  + f );
      }
        } 
     }
          

