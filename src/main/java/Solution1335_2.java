/*
Algorithm: Dynamic programming
Time complexity:
Space complexity:
Comments:  with tabulation
Solution: leetcode
 */

public class Solution1335_2 {

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty.length < d) return -1;
        int N = jobDifficulty.length;
        int[][] dp = new int[d][N];
        dp[0][0] = jobDifficulty[0];
        for (int i = 1; i < N; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], jobDifficulty[i]);
        }
        for (int k = 1; k < d; k++) {
            for (int j = k; j < N; j++) {
                dp[k][j] = Integer.MAX_VALUE;
                int dayMaxCost = jobDifficulty[j];
                for (int c = j; c >= k; c--) {
                    dayMaxCost = Math.max(dayMaxCost, jobDifficulty[c]);
                    dp[k][j] = Math.min(dp[k][j], dp[k - 1][c - 1] + dayMaxCost);
                }
            }
        }
        return dp[d - 1][N - 1];
    }
}
