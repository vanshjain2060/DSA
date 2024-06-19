package Vansh.Pattern_Advanced;

public class palindromic_pattern {
    public static void palPattern(int n){
        for(int i=1;i<=n;i++){
            // for __
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            } 
            // for decending loop   
            for(int j=i;j>=2;j--){
                 System.out.print(j);
            }
            // for increasing loop
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
    }
    }
public static void main(String[] args) {
    palPattern(5);
}
}
