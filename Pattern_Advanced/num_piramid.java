package Vansh.Pattern_Advanced;

public class num_piramid {
    public static void numPiramid(int n){
      for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numPiramid(5);
    }
}
