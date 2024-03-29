package Vansh.Stacks;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
       String str = "(((a+b)))";  // true
       String str2 = "(a+b)";     // false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }

    private static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                int count=0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count == 0) return true;
                else s.pop();
            }
            else s.push(ch);
        }
        return false;
    }

}
