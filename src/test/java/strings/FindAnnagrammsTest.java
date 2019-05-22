package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAnnagrammsTest {

  @Test
  public void test() {
    FindAnnagramms findAnnagramms = new FindAnnagramms();
    List<Integer> res = findAnnagramms.findAnnagramms("ab", "abcba");
    assertEquals(Arrays.asList(0, 3), res);
  }

}