package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution387Test {

  @Test
  public void edgeCase1() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar(null);
    assertEquals(-1, res);
  }

  @Test
  public void edgeCase2() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("");
    assertEquals(-1, res);
  }

  @Test
  public void baseCase1() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("a");
    assertEquals(0, res);
  }

  @Test
  public void baseCase2() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("aa");
    assertEquals(-1, res);
  }

  @Test
  public void baseCase3() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("aba");
    assertEquals(1, res);
  }

  @Test
  public void regularCase1() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("hellohworld");
    assertEquals(1, res);
  }

  @Test
  public void regularCase2() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("abccba");
    assertEquals(-1, res);
  }

  @Test
  public void regularCase3() {
    Solution387 solution387 = new Solution387();
    int res = solution387.firstUniqChar("leetcode");
    assertEquals(0, res);
  }

}