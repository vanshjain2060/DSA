package Vansh.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class VaildParentheses {
    public static void main(String[] args) {
        String s = "1010";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char c : ch) {
            System.out.print(c + "  ");
        }
    }

    private static boolean Check(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') s.push(ch);
            else {
                if(s.isEmpty()) return false;
                else if( (s.peek()=='(' && ch==')')
                      || (s.peek()=='[' && ch==']')
                      || (s.peek()=='{' && ch=='}') ) {
                    s.pop();
                }else return false;
            }
        }
        if(!s.isEmpty()) return false;
        return true;
    }

}