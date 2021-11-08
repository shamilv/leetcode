package stackAndHeap;

import java.util.*;

/**
 * me
 *
 * T.C.: O(n)
 * S.C.: O(n)
 */
public class Solution20 {
    public boolean isValid(String text) {
        Map<Character, Character> openerByCloser;
        openerByCloser = new HashMap<>();
        openerByCloser.put('}', '{');
        openerByCloser.put(']', '[');
        openerByCloser.put(')', '(');
        openerByCloser.put('>', '<');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (isOpener(c)) {
                stack.push(c);
            } else if (isCloser(c)) {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpener = stack.pop();
                char properOpener = openerByCloser.get(c);

                if (lastOpener != properOpener) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpener(char c) {
        return c == '{' || c == '(' || c == '[' || c == '<';
    }

    private boolean isCloser(char c) {
        return c == '}' || c == ')' || c == ']' || c == '>';
    }

    /*public boolean isValid(String s) {
        Set<Character> set = new HashSet<>();
        set.add('(');
        set.add(')');
        set.add('{');
        set.add('}');
        set.add('[');
        set.add(']');
        set.add('<');
        set.add('>');
        set.add('|');
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        map.put('>', '<');
        map.put('|', '|');
        for (Character ch: s.toCharArray()) {
            if (set.contains(ch)) {
                if (!stack.isEmpty() && stack.peek() == map.get(ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }*/
}
