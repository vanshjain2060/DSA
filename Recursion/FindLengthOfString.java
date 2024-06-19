package Vansh.Recursion;

public class FindLengthOfString {
    public static void lengthOfSting(int i , String str){
       // Edge Case
       if(str.length() == 0){
        System.out.print("0"); 
        return;
       }
        if(i == str.length()){
            int ans = i;
            System.out.print(ans);
            return;
        }
        lengthOfSting(i+1, str);
    }
    public static void main(String[] args) {
        String str = "vanshjain";
        lengthOfSting(0, str);
    }
}
