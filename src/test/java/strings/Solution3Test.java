package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

  @Test
  public void edgeCase() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring(null);
    assertEquals(0, res);
  }

  @Test
  public void baseCase() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring("a");
    assertEquals(1, res);
  }

  @Test
  public void baseCase2() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring("aa");
    assertEquals(1, res);
  }

  @Test
  public void baseCase3() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring("av");
    assertEquals(2, res);
  }

  @Test
  public void regularCase1() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring("xabcadm");
    assertEquals(5, res);
  }

  @Test
  public void regularCase2() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring("xabcAdm");
    assertEquals(7, res);
  }

  @Test
  public void regularCase3() {
    Solution3 solution3 = new Solution3();
    int res = solution3.lengthOfLongestSubstring("caacd");
    assertEquals(3, res);
  }

}