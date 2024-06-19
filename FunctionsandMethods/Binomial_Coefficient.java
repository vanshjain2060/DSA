package Vansh.FunctionsandMethods;

public class Binomial_Coefficient {
      
 public static int Factroial(int n) {
        int f=1;
        for(int i =1; i<=n;i++){
         f=f*i;
        }return f;
    }
    public static int binCoeff(int n, int r){
    int fact_n =Factroial(n);
    int fact_r =Factroial(r);
    int fact_nmr =Factroial(n-r);

    int binCoeff =fact_n /(fact_r*fact_nmr);
    return binCoeff ;
    }
    public static void main(String[] args) {
        System.out.println("Binary Coefficient of the number is " + binCoeff(5,2));
    }
}

