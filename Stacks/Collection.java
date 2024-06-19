package Vansh.Stacks;
import java.util.*;
public class Collection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> sb = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(sb.push(s.peek()));
            s.pop();
        }
    }
}
