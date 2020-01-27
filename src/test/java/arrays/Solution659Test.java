package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution659Test {

    @Test
    public void test1() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3});
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 4});
        assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 4, 5, 6});
        assertTrue(ans);
    }

    @Test
    public void test4() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 3, 4, 5});
        assertTrue(ans);
    }

    @Test
    public void test5() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 3, 4, 4, 5, 5});
        assertTrue(ans);
    }

    @Test
    public void test6() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 4, 4, 5, 5});
        assertFalse(ans);
    }

    @Test
    public void test7() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2});
        assertFalse(ans);
    }

    @Test
    public void test8() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 6});
        assertFalse(ans);
    }

    @Test
    public void test9() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10});
        assertTrue(ans);
    }

    @Test
    public void test10() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{1, 2, 3, 4, 6, 7, 8, 10, 11, 12});
        assertTrue(ans);
    }
    @Test
    public void test11() {
        Solution659 solution659 = new Solution659();
        boolean ans = solution659.isPossible(new int[]{4,5,6,7,7,8,8,9,10,11});
        assertTrue(ans);
    }

}