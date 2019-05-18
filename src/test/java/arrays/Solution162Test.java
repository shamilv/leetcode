package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution162Test {

  @Test
  public void baseCase() {
    Solution162 solution162 = new Solution162();
    int index = solution162.findPeakElement(new int[]{1, 3, 2});
    assertEquals(1, index);
  }

  @Test
  public void baseCase2() {
    Solution162 solution162 = new Solution162();
    int index = solution162.findPeakElement(new int[]{1, 3, 4});
    assertEquals(-1, index);
  }

  @Test
  public void regularCase1() {
    Solution162 solution162 = new Solution162();
    int index = solution162.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
    assertEquals(5, index);
  }

}