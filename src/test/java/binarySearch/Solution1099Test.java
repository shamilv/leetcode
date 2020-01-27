package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1099Test {

    @Test
    public void test1() {
        Solution1099 solution1099 = new Solution1099();
        int ans = solution1099.twoSumLessThanK(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60);
        assertEquals(58, ans);
    }

    @Test
    public void test2() {
        Solution1099 solution1099 = new Solution1099();
        int ans = solution1099.twoSumLessThanK(new int[]{3, 1, 2}, 3);
        assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        Solution1099 solution1099 = new Solution1099();
        int ans = solution1099.twoSumLessThanK(new int[]{3, 1, 2}, 4);
        assertEquals(3, ans);
    }

    @Test
    public void test4() {
        Solution1099 solution1099 = new Solution1099();
        int ans = solution1099.twoSumLessThanK(new int[]{3, 1, 2}, 5);
        assertEquals(4, ans);
    }

    @Test
    public void test5() {
        Solution1099 solution1099 = new Solution1099();
        int ans = solution1099.twoSumLessThanK(new int[]{3, 1, 2}, 6);
        assertEquals(5, ans);
    }

}