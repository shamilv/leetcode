package arrays;

public class Solution75 {
  public void sortColors(int[] nums) {
    if (nums == null || nums.length == 0)
      return;
    int left = -1, index = 0;
    int right = lastRight(nums);

    while (index < right) {
      if (nums[index] == 0) {
        swap(nums, ++left, index);
        index++;
      } else if (nums[index] == 2) {
        swap(nums, --right, index);
      } else {
        index++;
      }
    }
  }

  private int lastRight(int[] nums) {
    int right = nums.length;
    while (right > 0 && nums[right- 1] == 2)
      right--;
    return right;
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[j];
    nums[j] = nums[i];
    nums[i] = tmp;
  }
}
