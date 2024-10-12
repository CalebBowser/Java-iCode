import java.util.Stack;

public class BalancedParenthesesChecker {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Unmatched closing parenthesis
            }
        }

        return stack.isEmpty(); // If stack is empty, all parentheses are balanced
    }

    public static void main(String[] args) {
        String balancedExpression = "(([]{}))";
        String unbalancedExpression = "({[)}";

        System.out.println("Is \"" + balancedExpression + "\" balanced? " + isBalanced(balancedExpression));
        System.out.println("Is \"" + unbalancedExpression + "\" balanced? " + isBalanced(unbalancedExpression));
    }
}
