package arrays;

public class Solution209 {
  public int minSubArrayLen(int s, int[] nums) {
    int left = 0, right = 0, sum = nums[0];
    Integer minlen = null;
    while (left < nums.length && right < nums.length) {
      if (sum >= s) {
        minlen = minlen != null ? Math.min(minlen, right - left + 1) : right - left + 1;
        sum -= nums[left++];
      } else {
        if (++right < nums.length)
          sum += nums[right];
      }
    }
    return minlen != null ? minlen : 0;
  }
}
