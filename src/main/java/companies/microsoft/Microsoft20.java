package companies.microsoft;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Microsoft20 {
    private Map<Character, Character> map = new HashMap<>();
    {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch: s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == map.get(ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }

}
