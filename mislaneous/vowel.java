package Vansh.mislaneous;
import java.util.*;

public class vowel {
    public static void main(String args[]){
      System.out.println("Enter your input");
    try (Scanner sc = new Scanner(System.in)) {
      String s =sc.nextLine();
     char ch=s.charAt(0);
     if(s.length()==1){
       if(ch == 'a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch == 'A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
          System.out.println("typed character is a vowel");
        else if (ch>=65 && ch<=90 || ch>=97 && ch<=122)
         System.out.println("typed character is a consonant");
         else if(ch>=48 && ch<=57)
         System.out.println("typed character is digit");
         else
         System.out.println("typed character is a special character");
    } 
    else
    System.out.println("Invalid Input :( your input has to be a single key)");
  }
}
        
    }
