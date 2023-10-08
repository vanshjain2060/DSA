package Vansh.Loops;
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your number here");
            int n = sc.nextInt();
 boolean isPrime = true;
 for(int i = 2; i<= Math.sqrt(n);i++){
   if( n%i==0 ){
            isPrime=false;
   }
 }
if(isPrime==true){
   System.out.println("n is a prime number");
} else{
   System.out.println("n is not a prime number");
}
        }
    }
       }
