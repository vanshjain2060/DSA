package Vansh.FunctionsandMethods;

public class underStand {
    /*  public static boolean isPrime(int n){
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
    public static void main(String[] args) {
       int n = 10;
        for(int i=2; i<=n;i++){
            if(isPrime(i)){ //true    
                 }
        }System.out.println();
    }*/
 

public static void binToDec(int n){
    int pow =0;
    int Decimal =0;
   // int lastDigit=n%10;
    while(n>0){
        int lastDigit = n%10;
     Decimal=  Decimal+ lastDigit *(int)Math.pow(2,pow);
       pow++;
      n= n/10;
    } 
    System.out.print(Decimal);
return;}
public static void main(String[] args) {
    binToDec(101);
}
}

  
