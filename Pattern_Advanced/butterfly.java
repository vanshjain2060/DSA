package Vansh.Pattern_Advanced;
// [LOGIC] Pattern ko do part me break kiya hai 
// upper part then next part me uska mirror kar denge
// har line me pahele kuch * print honge fir _ and then again *
public class butterfly {
    public static void butFly(int n ){
       // for first half 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){           
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // for second half
       for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
            System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
            System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
            System.out.print("* ");
            }
            System.out.println();
       } 
    }
public static void main(String[] args) {
    butFly(3);
}    
}
