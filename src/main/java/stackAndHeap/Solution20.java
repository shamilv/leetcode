package stackAndHeap;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * me
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */
public class Solution20 {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty())
            return true;
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char ch: chars) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                char op = stack.pop();
                if (ch == ')' && op != '(')
                    return false;
                else if (ch == '}' && op != '{')
                    return false;
                else if (ch == ']' && op != '[')
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
