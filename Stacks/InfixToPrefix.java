import java.util.Stack;

public class InfixToPrefix {

    static int Prec(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '^') return 3;
        else return -1;
    }

    static String reverse(String exp) {
        StringBuilder reversed = new StringBuilder(exp.length());
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (c == '(') reversed.append(')');
            else if (c == ')') reversed.append('(');
            else reversed.append(c);
        }
        return reversed.toString();
    }

    static String infixToPostfix(String exp) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) result += c;

            else if (c == '(') stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') result += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) result += stack.pop();
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    static String infixToPrefix(String exp) {
        String reversedInfix = reverse(exp);
        String postfix = infixToPostfix(reversedInfix);
        return reverse(postfix);
    }

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + infixToPrefix(exp));
    }
}