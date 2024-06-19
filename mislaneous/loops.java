package Vansh.mislaneous;

public class loops {
    public static void main(String[] args) {
        // int a=1;
        for(int i=1; i<=7; i++) {
           int a=i;
            for(int j=1; j<=7; j++){
                if(a>7){
                    a=1;
                }
                System.out.print(a);
                a++;
                
            }
            System.out.println();
            
    }
        /* 
        for(int i=1; i<=7; i++) {
            for(int j=i; j<=7; j++){
                System.out.print(j);
            }
            
            for(int j=1; j<=(i-1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */
       
    }
}