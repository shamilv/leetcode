package dynamicProgramming;

public class Solution1143 {
    private String text1 = "", text2 = "";
    private int n, m;
    private int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
        n = text1.length();
        m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
    
    public int longestCommonSubsequenceTopDown(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
        n = text1.length();
        m = text2.length();
        memo = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                memo[i][j] = -1;
            }
        }
        return dp(0, 0);
    }
    
    private int dp(int i, int j) {
        if (i == n) return 0;
        if (j == m) return 0;
        
        if (memo[i][j] == -1) {
            if (text1.charAt(i) == text2.charAt(j)) {
                memo[i][j] = 1 + dp(i+1, j+1);
            } else {
                memo[i][j] = Math.max(dp(i, j+1), dp(i+1, j));
            }
        }
        return memo[i][j];
    }
}
