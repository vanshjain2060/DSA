package Vansh.Strings;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str){
       for(int i=0; i<str.length()/2; i++){
          if(str.charAt(i) != str.charAt(str.length()-1-i)){
          // not a palindrome
            return false;
          }
       } return true;
    }
    public static void main(String[] args) {
       // for taking input from user
        System.out.println("Enter your word");
        try (Scanner sc = new Scanner(System.in)) {
            String srt = sc.nextLine();
            
            // Calling the function 
            
            if(isPalindrome(srt) == true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
