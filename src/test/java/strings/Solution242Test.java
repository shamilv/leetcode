package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution242Test {

  @Test
  public void edgeCase() {
    Solution242 solution242 = new Solution242();
    boolean res = solution242.isAnagram(null, null);
    assertFalse(res);
  }

  @Test
  public void edgeCase2() {
    Solution242 solution242 = new Solution242();
    boolean res = solution242.isAnagram("", "");
    assertFalse(res);
  }

  @Test
  public void baseCase1() {
    Solution242 solution242 = new Solution242();
    boolean res = solution242.isAnagram("a", "a");
    assertTrue(res);
  }

  @Test
  public void baseCase2() {
    Solution242 solution242 = new Solution242();
    boolean res = solution242.isAnagram("b", "a");
    assertFalse(res);
  }

  @Test
  public void regularCase1() {
    Solution242 solution242 = new Solution242();
    boolean res = solution242.isAnagram("aloha", "hoala");
    assertTrue(res);
  }

  @Test
  public void regularCase2() {
    Solution242 solution242 = new Solution242();
    boolean res = solution242.isAnagram("aloha", "hola");
    assertFalse(res);
  }

}