package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1_6Test {

    @Test
    public void test1() {
        Solution1_6 solution1_6 = new Solution1_6();
        String ans = solution1_6.compress("a");
        assertEquals("a", ans);
    }

    @Test
    public void test2() {
        Solution1_6 solution1_6 = new Solution1_6();
        String ans = solution1_6.compress("aa");
        assertEquals("aa", ans);
    }

    @Test
    public void test3() {
        Solution1_6 solution1_6 = new Solution1_6();
        String ans = solution1_6.compress("aaa");
        assertEquals("a3", ans);
    }

    @Test
    public void test4() {
        Solution1_6 solution1_6 = new Solution1_6();
        String ans = solution1_6.compress("aaab");
        assertEquals("a3b", ans);
    }

    @Test
    public void test5() {
        Solution1_6 solution1_6 = new Solution1_6();
        String ans = solution1_6.compress("aabcccccaaa");
        assertEquals("a2bc5a3", ans);
    }

}