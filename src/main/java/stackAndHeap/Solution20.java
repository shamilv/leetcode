package stackAndHeap;

import java.util.LinkedList;

/**
 * me
 */
public class Solution20 {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty())
            return true;
        LinkedList<Character> stack = new LinkedList<>();
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
