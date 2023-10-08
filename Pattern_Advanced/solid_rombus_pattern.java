package Vansh.Pattern_Advanced;
//[Logic] is Pattern me har line me pahele kuch _ print hogi and then * 
public class solid_rombus_pattern {
  public static void rombus_Pattern(int n){
        //outer loop for rows 
   for(int i=1; i<=n;i++){
        //for spaces
         for(int j=1;j<=n-i;j++){
         System.out.print("  ");
        }
         // for stars
        for(int j =1;j<=n;j++){
        System.out.print("* ");
        } 
        System.out.println();
    }
     System.out.println();
  }
    public static void main(String[] args) {
        rombus_Pattern(5);
    }
}
