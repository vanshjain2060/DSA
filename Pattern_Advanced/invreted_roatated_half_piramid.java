package Vansh.Pattern_Advanced;

public class invreted_roatated_half_piramid {
    public static void invreted_Roatated_Half_Piramid(int n){
        //outer loop for rows 
        for(int i=1; i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            // for stars
            for(int j =1;j<=i;j++){
            System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        invreted_Roatated_Half_Piramid(4);
    }
}
