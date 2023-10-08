package Vansh.Loops;
import java.util.*;
public class print_num1_to_n {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int counter=1;
            while(counter <=n) {
                System.out.print(counter +" ");
                counter++;
            }
        }
    }
}
