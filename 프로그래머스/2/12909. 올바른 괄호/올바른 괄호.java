import java.util.Stack;

class Solution {
    boolean solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}