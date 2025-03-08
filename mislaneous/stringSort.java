import java.util.*;
public class stringSort {
    public static void main(String[] args) {
        String[] arr = {"vansh" , "vedant", "megha", "saurabh", "mohit" ,"gaurav", "aadit", "praydhuman"};
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i].substring(3);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
