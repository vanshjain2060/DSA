package Vansh.Loops;
import java.util.*;
public class que_on_continue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do{System.out.print("enter your number here" + " "); 
                int num = sc.nextInt();
                if( num % 10 ==0 ) {
                    continue;
                } System.out.println( "your number is " + num );
            }while(true);
        }
        }
}
