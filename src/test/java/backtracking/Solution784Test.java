package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution784Test {

    @Test
    public void test1() {
        Solution784 solution784 = new Solution784();
        List<String> res = solution784.letterCasePermutation("a1b");
        assertEquals(Arrays.asList("a1b", "a1B", "A1b", "A1B"), res);
    }

    @Test
    public void test2() {
        Solution784 solution784 = new Solution784();
        List<String> res = solution784.letterCasePermutation("");
        System.out.println(res);
        assertEquals(Arrays.asList(""), res);
    }

    @Test
    public void test3() {
        Solution784 solution784 = new Solution784();
        List<String> res = solution784.letterCasePermutation(null);
        assertEquals(0, res.size());
    }

    @Test
    public void test4() {
        Solution784 solution784 = new Solution784();
        List<String> res = solution784.letterCasePermutation("1234567");
        assertEquals(Arrays.asList("1234567"), res);
    }

}