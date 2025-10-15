import java.io.*;
import java.util.*;
import java.math.*;

public class InputPatterns {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        String str = "huklasdf lkajshdf jh alksjhdf jh";
        String[] arr = str.split(" ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextLine();
        // }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " line" + i);
    }
}
