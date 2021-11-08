/*
Algorithm: Dynamic Programming
Time complexity: O(N^2)
Space complexity: O(N^2)
Comments: with tabulation approach
Solution: mine (there is a better solution at leetcode)
 */

public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        int M = matrix.length; int N = matrix[0].length;
        if (M == 1) {
            for (int j = 0; j < N; j++) {
                if (matrix[0][j] == '1') return 1;
            }
            return 0;
        }
        int side = 0; int[][] dp = new int[M + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (dp[i-1][j] != 0 && dp[i-1][j-1] != 0 && dp[i][j-1] != 0 && matrix[i-1][j-1] != '0') {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                } else {
                    dp[i][j] = matrix[i-1][j-1] - '0';
                }
                side = Math.max(side, dp[i][j]);
            }
        }
        return side * side;
    }
}
