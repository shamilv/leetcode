package dynamicProgramming;

public class Solution70 {
    
    private int[] memo;

    public int climbStairsTopDown(int n) {
        memo = new int[n];
        return dp(n);
    }
    
    private int dp(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (memo[n - 1] == 0) {
            memo[n - 1] = dp(n - 1) + dp(n - 2);
        }
        return memo[n - 1];
    }
}
