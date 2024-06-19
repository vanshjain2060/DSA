package Vansh.Pattern_Advanced;
// [Logic] hollow rectangle ke code ke pdhele __ ke liye code likh diya hai
public class hollow_rombus {
    public static void holRom(int n){
        for(int i=1;i<=n;i++){
            // for __
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            // for *
            for(int j =1;j<=n;j++){
             if( i==1 || i==n || j==1 || j==n ){
                System.out.print("*  ");
             }    
             else {System.out.print("   ");}
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    holRom(4);
}   
}
