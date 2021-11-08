public class Solution1746 {
    public int maxSumAfterOperation(int[] nums) {
        int N = nums.length;
        int[][] dp = new int[N][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0] * nums[0];
        int max = dp[0][1];
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i-1][0] + nums[i], nums[i]);
            dp[i][1] = Math.max(Math.max(dp[i-1][0] + nums[i] * nums[i], dp[i-1][1] + nums[i]), nums[i] * nums[i]);
            max = Math.max(max, dp[i][1]);
        }
        return max;
    }

    public int maxSumAfterOperation_2(int[] nums) {
        int N = nums.length;
        int maxWithoutOperation = nums[0];
        int maxWithOperation = nums[0] * nums[0];
        int max = maxWithOperation;
        for (int i = 1; i < N; i++) {
            maxWithOperation = Math.max(Math.max(maxWithoutOperation + nums[i] * nums[i], maxWithOperation + nums[i]), nums[i] * nums[i]);
            maxWithoutOperation = Math.max(maxWithoutOperation + nums[i], nums[i]);
            max = Math.max(max, maxWithOperation);
        }
        return max;
    }
}

