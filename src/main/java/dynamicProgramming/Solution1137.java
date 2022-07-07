package dynamicProgramming;

public class Solution1137 {

    public int tribonacci(int n) {
        if (n==0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
    
    public int tribonacciTopDown(int n) {
        if (n == 0) return 0;
        int[] memo = new int[n];
        return dp(n, memo);
    }
    
    private int dp(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (memo[n-1] != 0) return memo[n-1];
        int ans = dp(n-1, memo) + dp(n-2, memo) + dp(n-3, memo);
        memo[n-1] = ans;
        return ans;
    }
}
