package dynamicProgramming;

public class Solution1770 {
    private Integer[][] memo;
    private int n, m;
    private int[] nums, mult;

    public int maximumScore(int[] nums, int[] multipliers) {
        n = nums.length;
        m = multipliers.length;
        int[][] dp = new int[m+1][m+1];
        for (int i = m - 1; i >= 0; i--) {
            for (int left = i; left >= 0; left--) {
                int right = (n - 1) - (i - left);
                int mult = multipliers[i];
                dp[i][left] = Math.max(mult * nums[left] + dp[i+1][left+1],
                    mult*nums[right] + dp[i+1][left]);
            }
        }
        return dp[0][0];
    }
    
    public int maximumScoreTopDown(int[] nums, int[] multipliers) {
        n = nums.length;
        m = multipliers.length;
        this.nums = nums;
        this.mult = multipliers;
        this.memo = new Integer[m][m];
        return dp(0, 0);
    }
    
    private int dp(int i, int left) {
        if (i == m) return 0;
        if (memo[i][left] == null) {
            int right = (n - 1) - (i - left);
            memo[i][left] = Math.max(mult[i] * nums[left] + dp(i+1, left+1), 
                                  mult[i] * nums[right] + dp(i+1, left));
        }
        return memo[i][left];
    }
}
