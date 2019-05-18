package arrays;

public class Solution162 {

  public int findPeakElement(int[] nums) {
    return findPeakElement(nums, 0, nums.length - 1);
  }

  private int findPeakElement(int[] nums, int left, int right) {
    int mid = left + (right - left)/2;
    if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
      return mid;
    if (right - left == 2)
      return -1;
    int index = findPeakElement(nums, mid, right);
    if (index == -1)
      index = findPeakElement(nums, left, mid);
    return index;
  }
}
