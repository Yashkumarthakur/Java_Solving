package practice_codes.amazon_interviewbit.stacks_queues;

import java.util.Stack;

/**
 * Generate all Parentheses
 * Asked in:
 * Amazon
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 *
 */
public class GenerateAllParentheses {
    public static void main(String[] args) {
        String input = "()[]{}";
        callForIsValidParentheses(input);
    }

    protected static boolean callForIsValidParentheses(String input) {
        System.out.println("Given input is : " + input);
        boolean result = isValidParentheses(input);
        System.out.println("Result is : " + result);
        return result;
    }

    private static boolean isValidParentheses(String input) {
        if (input == null || input.isEmpty()) return false;
        Stack<Character> charStack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == ')' || c == '}' || c == ']') {
                if (charStack.isEmpty()) return false;
                char temp = charStack.pop();
                if (c == ')' && temp != '(') return false;
                else if (c == '}' && temp != '{') return false;
                else if (c == ']' && temp != '[') return false;
            } else {
                charStack.push(c);
            }
        }
        return charStack.empty();
    }
}
