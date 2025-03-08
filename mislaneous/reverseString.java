import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String[] arr = {"vansh" , "vedant", "megha", "saurabh", "mohit" ,"gaurav", "aadit", "praydhuman"};
        for(int i=0; i<arr.length; i++) {
            arr[i] = reverseStr(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static String reverseStr(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
