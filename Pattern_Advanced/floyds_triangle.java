package Vansh.Pattern_Advanced;

public class floyds_triangle {
    public static void floTri(int n){
        int num =1;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floTri(5);
    }
}
