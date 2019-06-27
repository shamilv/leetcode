package stackAndHeap;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * not me
 *
 */
public class Solution1021 {

    public String removeOuterParentheses(String S) {
        if (S == null || S.isEmpty())
            return "";
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        for (char ch: S.toCharArray()) {
            if (ch == '(' && cnt++ > 0)
                ans.append(ch);
            else if (ch == ')' && cnt-- > 1)
                ans.append(ch);
        }
        return ans.toString();
    }

    public String removeOuterParenthesesMine(String S) {
        if (S == null || S.isEmpty())
            return "";
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        for (char ch: S.toCharArray()) {
            deque.offer(ch);
            if (ch == '(') {
                cnt++;
            }
            else {
                cnt--;
            }
            if (cnt == 0) {
                deque.pollFirst();
                deque.pollLast();
                while (!deque.isEmpty())
                    ans.append(deque.poll());
            }
        }
        return ans.toString();
    }
}
