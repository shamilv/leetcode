/*
Algorithm: Dynamic Programming
Time complexity: O(N^2)
Space complexity: O(N^2)
Comments: with tabulation approach
Solution: leetcode
 */

import java.util.Arrays;

public class Solution221_2 {
    public int maximalSquare(char[][] matrix) {
        int M = matrix.length; int N = matrix[0].length;
        if (M == 0) return 0;
        int side = 0; int[][] dp = new int[M + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                    side = Math.max(side, dp[i][j]);
                }
            }
        }
        return side * side;
    }
}
