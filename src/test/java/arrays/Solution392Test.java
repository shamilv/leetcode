package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution392Test {

    @Test
    public void test1() {
        Solution392 solution392 = new Solution392();
        boolean ans = solution392.isSubsequence("abc", "baabc");
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution392 solution392 = new Solution392();
        boolean ans = solution392.isSubsequence("a", "a");
        assertTrue(ans);
    }

    @Test
    public void test21() {
        Solution392 solution392 = new Solution392();
        boolean ans = solution392.isSubsequence("a", "b");
        assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution392 solution392 = new Solution392();
        boolean ans = solution392.isSubsequence("ace", "abcde");
        assertTrue(ans);
    }

    @Test
    public void test4() {
        Solution392 solution392 = new Solution392();
        boolean ans = solution392.isSubsequence("aec", "abcde");
        assertFalse(ans);
    }

}