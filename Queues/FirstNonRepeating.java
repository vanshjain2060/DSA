package Vansh.Queues;
import java.util.*;
public class FirstNonRepeating {
    public static void nonRepeating(String s) {
        int arr[] = new int[26];
        Queue<Character> a = new LinkedList<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            a.add(ch);
            arr[ch-'a']++;
            while(!a.isEmpty() && arr[a.peek()-'a'] > 1) {
                a.remove();
            }
            if(a.isEmpty()) System.out.print(-1 + " ");
            else System.out.print(a.peek() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str =  "aabccxb";
        nonRepeating(str);
    }
}
