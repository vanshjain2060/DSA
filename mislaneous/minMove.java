// package Vansh.mislaneous;
import java.util.*;
public class minMove {
    public static void main(String[] args) {
        String s = "]]][[[[]]][[";
        Stack<Character> st = new Stack<>();
        int size =0;
        for(char ch : s.toCharArray()) {
            if(ch == '[') st.push(ch);
            else {
                if(!st.isEmpty() && st.peek() == '[') st.pop();
                else size++;
            }
        }
        System.out.println((st.size()+1)/2);
        System.out.println((size+1)/2);
    }
}
