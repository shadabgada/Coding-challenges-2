package leetcode.DS1.stack_queues;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/
refer my codility example

 */
public class Valid_Parentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));

    }
}
