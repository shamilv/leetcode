import java.util.Stack;

/*
Algorithm:
Time complexity:
Space complexity:
Comments:
Solution: leetcode
 */

public class Solution224_2 {

    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0, total = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (int) ch - '0';
            } else if (ch == '+' || ch == '-') {
                total += sign * number;
                number = 0;
                sign = ch == '+' ? 1 : -1;
            } else if (ch == '(') {
                stack.push(total);
                stack.push(sign);
                total = 0;
                sign = 1;
            } else if (ch == ')') {
                total += sign * number;
                number = 0;
                sign = 1;
                int tmpSign = stack.pop();
                int tmpTotal = stack.pop();
                total = tmpTotal + tmpSign * total;
            }
        }
        total += sign * number;
        return total;
    }
}
