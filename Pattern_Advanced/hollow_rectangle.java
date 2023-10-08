package Vansh.Pattern_Advanced;
public class hollow_rectangle {

public static void hollow_Rectangle(int totRow , int totCol){
    //outher loop
    for(int i=1;i<=totRow;i++){
        //inner loop
        for(int j =1;j<=totCol;j++){
            //checking cell number=(i,j)
            if(i==1 || i==totRow || j==1 ||j==totCol){
              //boundary cells
                System.out.print("* ");
            }
    else{
    System.out.print("  ");
    }
} System.out.println();
    }
       }
 public static void main(String[] args) {
    hollow_Rectangle(4,6 );
 }
   }
