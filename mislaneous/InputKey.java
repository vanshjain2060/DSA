package Vansh.mislaneous;

import java.util.Scanner;

public class InputKey {
    public static void main(String args[]){
        // display message
      System.out.println("Enter your input key:");
       //creating scanner class to take the input
    try (Scanner sc = new Scanner(System.in)) {

      String s =sc.nextLine(); // string creation in this step
      char ch=s.charAt(0);

        if(s.length()==1){
            if(ch == 'a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| 
            ch == 'A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
             System.out.println("Typed character is a vowel");
            }
            else if (ch>=65 && ch<=90 || ch>=97 && ch<=122) {
            System.out.println("Typed character is a consonant");
            }
            else if(ch>=48 && ch<=57) {
            System.out.println("Typed character is digit");
            }
            else {
            System.out.println("Typed character is a special character");
            }
        } 
        else {
        System.out.println("Invalid Input :( your input has to be a single key)");
        }
    }
    }
}
