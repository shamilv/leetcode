package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution128Test {

  @Test
  public void edgeCaseNull() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(null);
    assertEquals(0, res);
  }

  @Test
  public void edgeCaseEmpty() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(new int[]{});
    assertEquals(0, res);
  }

  @Test
  public void baseCase1() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(new int[]{1});
    assertEquals(1, res);
  }

  @Test
  public void baseCase21() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(new int[]{2, 1});
    assertEquals(2, res);
  }

  @Test
  public void baseCase31() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(new int[]{3, 1});
    assertEquals(1, res);
  }

  @Test
  public void regularCase1() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(new int[]{1, 21, 3, 4, 6, 5});
    assertEquals(4, res);
  }

  @Test
  public void regularCase2() {
    Solution128 solution128 = new Solution128();
    int res = solution128.longestConsecutive(new int[]{1, 0, 3, 1, 2});
    assertEquals(4, res);
  }

}