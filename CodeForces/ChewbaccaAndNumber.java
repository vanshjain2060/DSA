import java.util.*;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        sc.close();
        System.out.println(getMin(num));
    }
    
    public static String getMin(String num) {
        int n = num.length();
        StringBuilder sb = new StringBuilder("");
        int i=0;
        if(i < n && num.charAt(i) == '9') {
            sb.append('9');
            i++;
        }
        while(i < n) {
            int ch = (num.charAt(i) - '0') < ('9' - num.charAt(i)) ?  (num.charAt(i) - '0') : ('9' - num.charAt(i));
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}