package Vansh.Pattern_Advanced;

public class inverted_piramid_with_num {
    /**
     * @param n
     */
    public static void invPiramidnum(int n){
       
        for(int i =1; i<=n;i++){
            int num =1;
            for(int j =1;j<=(n+1-i);j++){
               System.out.print(num +" ");
                num++;
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        invPiramidnum(5);
    }
}
