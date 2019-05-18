package arrays;

public class Solution153 {
  public int findMin(int[] nums) {
    if (nums.length == 1)
      return nums[0];

    return findMin(nums, 0, nums.length - 1);
  }

  private int findMin(int[] nums, int left, int right) {
    if (right - left == 1)
      return Math.min(nums[left], nums[right]);
    int mid = left + (right - left)/2;
    if (nums[mid] > nums[right])
      return findMin(nums, mid, right);
    else
      return findMin(nums, left, mid);
  }
}
