package Vansh.Stacks;

import java.util.Stack;

public class ReverseString {

    public static String Reverse(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!s.isEmpty()) {
            ans.append(s.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int ab = 123;
        String a = String.valueOf(ab);
        String s = Reverse(a);
        System.out.println(s);
    }
}
