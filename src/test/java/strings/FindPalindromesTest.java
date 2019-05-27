package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPalindromesTest {

  @Test
  public void test1() {
    FindPalindromes findPalindromes = new FindPalindromes();
    List<List<Integer>> res = findPalindromes.findPalindromes(Arrays.asList("hello", "olleh"));
    assertEquals(Arrays.asList(Arrays.asList(1, 0), Arrays.asList(0, 1)), res);
  }

  @Test
  public void test2() {
    FindPalindromes findPalindromes = new FindPalindromes();
    List<List<Integer>> res = findPalindromes.findPalindromes(Arrays.asList("aha", "ah"));
    assertEquals(Arrays.asList(Arrays.asList(1, 0), Arrays.asList(0, 1)), res);
  }

}