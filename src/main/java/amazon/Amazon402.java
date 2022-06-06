package amazon;

import java.util.Deque;
import java.util.LinkedList;

public class Amazon402 {
    public String removeKdigits(String num, int k) {
        Deque<Integer> deque = new LinkedList<>();
        for (char ch: num.toCharArray()) {
            int n = Character.getNumericValue(ch);
            while (k > 0 && !deque.isEmpty() && deque.peek() > n) {
                deque.pop();
                k--;
            }
            deque.push(n);
        }

        StringBuilder ans = new StringBuilder();
        int rest = k == 0 ? deque.size() : deque.size() - k;
        while (!deque.isEmpty() && rest-- > 0) {
            int n = deque.pollLast();
            if (ans.length() == 0 && n == 0) continue;
            ans.append(n);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
