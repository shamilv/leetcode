package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution153Test {

  @Test
  public void edgeCase() {
    Solution153 solution153 = new Solution153();
    int min = solution153.findMin(new int[]{1});
    assertEquals(1, min);
  }

  @Test
  public void baseCase21() {
    Solution153 solution153 = new Solution153();
    int min = solution153.findMin(new int[]{2, 1});
    assertEquals(1, min);
  }

  @Test
  public void baseCase534() {
    Solution153 solution153 = new Solution153();
    int min = solution153.findMin(new int[]{5, 3, 4});
    assertEquals(3, min);
  }

  @Test
  public void baseCase34512() {
    Solution153 solution153 = new Solution153();
    int min = solution153.findMin(new int[]{3, 4, 5, 1, 2});
    assertEquals(1, min);
  }
}