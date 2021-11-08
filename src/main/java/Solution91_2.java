/*
Algorithm: Dynamic programming
Time complexity:
Space complexity: O(N), where N is s.length
Comments: with memorization bottom-down approach
Solution: mine
 */
import java.util.HashMap;

public class Solution91_2 {
    public int numDecodings(String s) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return calc(s, 0, memo);
    }

    private int calc(String s, int i, HashMap<Integer, Integer> memo) {
        if (i == s.length()) return 1;
        if (s.charAt(i) == '0') return 0;
        int num = 0, ans = 0;
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            num = num * 10 + (ch - '0');
            if (num >= 1 && num <= 26) {
                Integer cnt = memo.get(i);
                ans += cnt != null ? cnt : calc(s, i + 1, memo);
                memo.put(i, ans);
            }
        }
        return ans;
    }
}
