package arrays;

public class Solution152 {
  public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;
    int curMax = nums[0], curMin = nums[0], globalMax = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int tmpMax = curMax;
      curMax = Math.max(Math.max(curMax * nums[i], curMin * nums[i]), nums[i]);
      curMin = Math.min(Math.min(tmpMax * nums[i], curMin * nums[i]), nums[i]);
      globalMax = globalMax < curMax ? curMax : globalMax;
    }
    return globalMax;
  }
}
