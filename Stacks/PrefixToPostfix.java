import java.util.Stack;

public class PrefixToPostfix {
    public static String prefixToPostfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                
                String postfix = operand1 + operand2 + c;
                stack.push(postfix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*+pq-mn";
        System.out.println("Prefix expression: " + exp);
        System.out.println("Postfix expression: " + prefixToPostfix(exp));
    }
}