package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution76Test {

  @Test
  public void baseCase1() {
    Solution76 solution76 = new Solution76();
    String res = solution76.minWindow("abc", "abc");
    assertEquals("abc", res);
  }

  @Test
  public void baseCase2() {
    Solution76 solution76 = new Solution76();
    String res = solution76.minWindow("aa", "aa");
    assertEquals("aa", res);
  }

  @Test
  public void baseCase3() {
    Solution76 solution76 = new Solution76();
    String res = solution76.minWindow("xxabbca", "abc");
    assertEquals("bca", res);
  }

  @Test
  public void baseCase4() {
    Solution76 solution76 = new Solution76();
    String res = solution76.minWindow("xxaxxbbx", "abc");
    assertEquals("", res);
  }

  @Test
  public void regularCase1() {
    Solution76 solution76 = new Solution76();
    String res = solution76.minWindow("ADOBECODEBANC", "ABC");
    assertEquals("BANC", res);
  }

  @Test
  public void regularCase2() {
    Solution76 solution76 = new Solution76();
    String res = solution76.minWindow("XXCAACCBAX", "ABC");
    assertEquals("CBA", res);
  }

}