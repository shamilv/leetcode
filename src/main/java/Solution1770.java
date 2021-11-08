public class Solution1770 {
    private int[] nums;
    private int[] mult;
    private Integer[][] memo;
    int N = 0;
    public int maximumScore(int[] nums, int[] multipliers) {
        this.N = nums.length;
        this.mult = multipliers;
        this.nums = nums;
        this.memo = new Integer[1000][1000];
        return calc(0, 0);
    }

    private int calc(int i, int l) {
        if (i == mult.length) {
            return 0;
        }
        if (memo[l][i] != null) {
            return memo[l][i];
        }
        int lscore = calc(i + 1, l + 1) + mult[i] * nums[l];
        int rscore = calc(i + 1, l) + mult[i] * nums[N - (i - l) - 1];
        memo[l][i] = Math.max(lscore, rscore);

        return memo[l][i];
    }
}
