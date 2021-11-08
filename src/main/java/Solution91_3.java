/*
Algorithm: Dynamic programming
Time complexity: O(N), where N is s.length
Space complexity: O(N), where N is s.length
Comments:  with tabulation
Solution: leetcode
 */

public class Solution91_3 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int N = s.length();
        int[] dp = new int[N + 1];
        dp[0] = 1; dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= N; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i - 1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[N];
    }
}
