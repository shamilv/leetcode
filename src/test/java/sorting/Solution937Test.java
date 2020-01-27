package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution937Test {

    @Test
    public void test1() {
        Solution937 solution937 = new Solution937();
        String[] ans = solution937.reorderLogFiles(new String[]{"b1 b", "a3 3", "a1 a"});
        List<String> exp = Arrays.asList("a1 a", "b1 b", "a3 3");
        assertEquals(exp, Arrays.asList(ans));
    }

    @Test
    public void test2() {
        Solution937 solution937 = new Solution937();
        String[] ans = solution937.reorderLogFiles(new String[]{"b2 b", "a3 3", "b1 b", "a1 a", "a1 2"});
        List<String> exp = Arrays.asList("a1 a", "b1 b", "b2 b", "a3 3", "a1 2");
        assertEquals(exp, Arrays.asList(ans));
    }

    @Test
    public void test3() {
        Solution937 solution937 = new Solution937();
        String[] ans = solution937.reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});
        List<String> exp = Arrays.asList("let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6");
        assertEquals(exp, Arrays.asList(ans));
    }

    @Test
    public void test4() {
        Solution937 solution937 = new Solution937();
        String[] ans = solution937.reorderLogFiles(new String[]{"a1 a","a1 9","a1 8"});
        List<String> exp = Arrays.asList("a1 a","a1 9","a1 8");
        assertEquals(exp, Arrays.asList(ans));
    }

}