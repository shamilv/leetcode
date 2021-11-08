public class Solution1664 {

    public int waysToMakeFair(int[] nums) {
        int N = nums.length + 2;
        int[] dp = new int[N];
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 2] + nums[i - 2];
        }
        int ans = 0;
        int maxeven = N % 2 == 0 ? dp[N - 2] : dp[N - 1];
        int maxodd = N % 2 == 0 ? dp[N - 1] : dp[N - 2];
        for (int i = 2; i < N; i++) {
            int sum1, sum2;
            if (i % 2 == 0) {
                sum1 = (maxeven - dp[i]) + dp[i - 1];
                sum2 = (maxodd - dp[i - 1]) + dp[i - 2];
            } else {
                sum1 = (maxodd - dp[i]) + dp[i - 1];
                sum2 = (maxeven - dp[i - 1]) + dp[i - 2];
            }
            if (sum1 == sum2) {
                ans++;
            }
        }
        return ans;
    }
}
