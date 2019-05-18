package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution152Test {

  @Test
  public void edgeCaseNull() {
    Solution152 solution152 = new Solution152();
    int res = solution152.maxProduct(null);
    assertEquals(0, res);
  }

  @Test
  public void edgeCaseEmpty() {
    Solution152 solution152 = new Solution152();
    int res = solution152.maxProduct(new int[]{});
    assertEquals(0, res);
  }

  @Test
  public void baseCase_2() {
    Solution152 solution152 = new Solution152();
    int res = solution152.maxProduct(new int[]{-2});
    assertEquals(-2, res);
  }

  @Test
  public void baseCase_1_2_3() {
    Solution152 solution152 = new Solution152();
    int res = solution152.maxProduct(new int[]{-1, -2, -3});
    assertEquals(6, res);
  }

  @Test
  public void baseCase2() {
    Solution152 solution152 = new Solution152();
    int res = solution152.maxProduct(new int[]{2});
    assertEquals(2, res);
  }

}