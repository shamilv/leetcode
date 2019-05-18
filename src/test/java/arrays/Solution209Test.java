package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution209Test {

  @Test
  public void baseCase1() {
    Solution209 solution209 = new Solution209();
    int res = solution209.minSubArrayLen(3, new int[]{3});
    assertEquals(1, res);
  }

  @Test
  public void baseCase2() {
    Solution209 solution209 = new Solution209();
    int res = solution209.minSubArrayLen(3, new int[]{2});
    assertEquals(0, res);
  }

  @Test
  public void regularCase1() {
    Solution209 solution209 = new Solution209();
    int res = solution209.minSubArrayLen(5, new int[]{1, 0, 2, 3,});
    assertEquals(2, res);
  }

  @Test
  public void regularCase2() {
    Solution209 solution209 = new Solution209();
    int res = solution209.minSubArrayLen(5, new int[]{1, 0, 2, 3, 7});
    assertEquals(1, res);
  }

  @Test
  public void regularCase3() {
    Solution209 solution209 = new Solution209();
    int res = solution209.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
    assertEquals(2, res);
  }

}