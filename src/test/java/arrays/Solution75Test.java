package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution75Test {

  @Test
  public void edgeCaseNull() {
    Solution75 solution75 = new Solution75();
    int[] nums = null;
    solution75.sortColors(nums);
    assertNull(nums);
  }

  @Test
  public void edgeCaseEmpty() {
    Solution75 solution75 = new Solution75();
    int[] nums = new int[]{};
    solution75.sortColors(nums);
    assertArrayEquals(new int[]{}, nums);
  }

  @Test
  public void baseCase201() {
    Solution75 solution75 = new Solution75();
    int[] nums = new int[]{2, 0, 1};
    solution75.sortColors(nums);
    assertArrayEquals(new int[]{0, 1, 2}, nums);
  }

  @Test
  public void baseCase120() {
    Solution75 solution75 = new Solution75();
    int[] nums = new int[]{1, 2, 0};
    solution75.sortColors(nums);
    assertArrayEquals(new int[]{0, 1, 2}, nums);
  }

  @Test
  public void regCase202110() {
    Solution75 solution75 = new Solution75();
    int[] nums = new int[]{2, 0, 2, 1, 1, 0};
    solution75.sortColors(nums);
    assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
  }

}