package Vansh.Loops;
import java.util.*;
public class Print_Reverse_of_a_num {
    public static void main(String[] args) {
       /*  int n = 10899;
        while (n>0){
            int lastDigit = n % 10 ;
  System.out.print(lastDigit + "");
  n = n/10;
           }*/
           
            try (Scanner sc = new Scanner(System.in)) {
                int n =sc.nextInt();
while (n>0){
   int lastDigit = n % 10 ;
System.out.print(lastDigit);
n = n/10;

   }
            }}}
