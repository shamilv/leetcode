/*
Algorithm: Dynamic programming
Time complexity:
Space complexity: O(N), where N is s.length
Comments: Time limit exceeded error in letcode
Solution: mine
 */

public class Solution91 {
    public int numDecodings(String s) {
        return calc(s, 0);
    }

    private int calc(String s, int i) {
        if (i == s.length()) return 1;
        if (s.charAt(i) == '0') return 0;
        int num = 0, ans = 0;
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            num = num * 10 + (ch - '0');
            if (num >= 1 && num <= 26) {
                ans += calc(s, i + 1);
            }
        }
        return ans;
    }
}
