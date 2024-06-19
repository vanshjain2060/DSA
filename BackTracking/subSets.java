package Vansh.BackTracking;

public class subSets {

    static void printSubString(String str , String ans , int i) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0) {  // this condition is for fhyi subset
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        // yes choice 
        printSubString(str, ans+ch, i+1);
        // no choice
        printSubString(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubString(str, "", 0);
    }
}
