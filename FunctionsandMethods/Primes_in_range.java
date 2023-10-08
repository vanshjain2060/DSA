package Vansh.FunctionsandMethods;

public class Primes_in_range {
    //we are using isPrime as a helper function in this question
    public static boolean isPrime(int n){
        //edge case
        if(n==2){
            return true;
        }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
            return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n;i++){
           if(isPrime(i) == true){ //true
               System.out.print(i+" ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
      primesInRange(18); 
    }
 }
