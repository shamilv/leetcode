package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1_9Test {

    @Test
    public void test1() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("a", "a");
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("aa", "aa");
        assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("ab", "ba");
        assertTrue(ans);
    }

    @Test
    public void test4() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("ab", "ca");
        assertFalse(ans);
    }

    @Test
    public void test5() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("abcde", "cdeab");
        assertTrue(ans);
    }

    @Test
    public void test6() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("abcde", "abced");
        assertFalse(ans);
    }

    @Test
    public void test7() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("abc", "abc");
        assertTrue(ans);
    }

    @Test
    public void test8() {
        Solution1_9 solution1_9 = new Solution1_9();
        boolean ans = solution1_9.rotateString("", "");
        assertTrue(ans);
    }

}