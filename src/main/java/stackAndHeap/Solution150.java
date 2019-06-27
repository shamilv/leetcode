package stackAndHeap;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * me
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token: tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token))
                calc(stack, token);
            else
                stack.push(Integer.valueOf(token));
        }
        return stack.pop();
    }

    private void calc(Deque<Integer> stack, String operation) {
        int a2 = Integer.valueOf(stack.pop());
        int a1 = Integer.valueOf(stack.pop());
        if ("+".equals(operation))
            stack.push(a1 + a2);
        else if ("-".equals(operation))
            stack.push(a1 - a2);
        else if ("*".equals(operation))
            stack.push(a1 * a2);
        else if ("/".equals(operation))
            stack.push(a1 / a2);
    }
}
