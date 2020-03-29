package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1_2Test {

    @Test
    public void test1() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("a", "a");
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("a", "b");
        assertFalse(ans);
    }

    @Test
    public void test3() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("ab", "b");
        assertFalse(ans);
    }

    @Test
    public void test4() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("ba", "ab");
        assertTrue(ans);
    }

    @Test
    public void test5() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("baa", "aba");
        assertTrue(ans);
    }

    @Test
    public void test6() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("baa", "ab");
        assertFalse(ans);
    }

    @Test
    public void test7() {
        Solution1_2 solution1_2 = new Solution1_2();
        boolean ans = solution1_2.isPermutation("ab", "baa");
        assertFalse(ans);
    }

}