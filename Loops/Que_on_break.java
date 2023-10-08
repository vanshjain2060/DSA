package Vansh.Loops;
import java.util.*;
public class Que_on_break {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        do{ System.out.println("enter your number ");
             int num = sc.nextInt();
        if(num%10 == 0 ){
            break;
        }System.out.println(num);
        }while(true);
    }
   } 
}
