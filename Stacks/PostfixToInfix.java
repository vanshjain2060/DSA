import java.util.Stack;

public class PostfixToInfix {

    static String postfixToInfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) { 
                stack.push(String.valueOf(c));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                String infix = "(" + operand1 + c + operand2 + ")";
                stack.push(infix);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "pq+mn-*";
        System.out.println("Postfix expression: " + exp);
        System.out.println("Infix expression: " + postfixToInfix(exp));
    }
}
