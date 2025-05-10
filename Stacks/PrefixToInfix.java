import java.util.Stack;

public class PrefixToInfix {
    public static String prefixToInfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Form the infix expression by wrapping it in parentheses
                String infix = "(" + operand1 + c + operand2 + ")";
                stack.push(infix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*+pq-mn";
        System.out.println("Prefix expression: " + exp);
        System.out.println("Infix expression: " + prefixToInfix(exp));
    }
}