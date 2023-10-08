package Vansh.FunctionsandMethods;

public class Prime_number {
   // only for n>=2
    public static boolean isPrime(int n){
        //boolean isPrime= true;
       // corner case or edge case
       if(n==2){
        return true;
       }

       // for(int i =1 ; i<=n-1; i++){      ..... this is a basic way
        // for more optimised way we write 
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n % i==0){
              // isPrime = false;
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println( isPrime(5));
}}
