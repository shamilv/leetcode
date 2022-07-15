package dynamicProgramming;

import java.util.Arrays;

public class Solution322 {
    private int[] coins;
    private int[] memo;

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin: coins) {
                int k = i - coin;
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public int coinChangeTopDown(int[] coins, int amount) {
        this.coins = coins;
        memo = new int[amount];
        int ans = dp(amount);
        return ans;
    }

    //[2, 4], 4
    private int dp(int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (memo[amount-1] != 0) {
            return memo[amount-1];
        }
        for (int coin: coins) {
            int local = dp(amount - coin);
            if (local != -1) {
                if (memo[amount-1] == 0) {
                    memo[amount-1] = local + 1;
                } else {
                    memo[amount-1] = Math.min(local + 1, memo[amount-1]);
                }
            }
        }
        if (memo[amount-1] == 0) {
            memo[amount-1] = -1;
        }
        return memo[amount-1];
    }
}
