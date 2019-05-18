package arrays;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int curVal = nums[0], curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curVal = Math.max(curVal + nums[i], nums[i]);
            curMax = Math.max(curMax, curVal);
        }
        return curMax;
    }
}
