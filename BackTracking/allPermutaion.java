package Vansh.BackTracking;

public class allPermutaion {

    static void Permutaion(String str , String ans) {
        // base case
        if(0 == str.length()) {
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0 ; i<str.length() ; i++) {
            char curr = str.charAt(i);
            // to remove the character of ith place form the string 
            String str1 = str.substring(0,i) +str.substring(i+1);
            Permutaion(str1, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc" ;
        Permutaion(str, "");
    }
}
