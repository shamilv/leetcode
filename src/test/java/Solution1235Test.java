import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1235Test {

    @Test
    public void test1() {
        int[] st = new int[]{1};
        int[] et = new int[]{3};
        int[] p = new int[]{10};
        Solution1235 solution1235 = new Solution1235();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(10, ans);
    }

    @Test
    public void test2() {
        int[] st = new int[]{1, 2, 5};
        int[] et = new int[]{3, 7, 6};
        int[] p = new int[]{10, 10, 5};
        Solution1235 solution1235 = new Solution1235();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(15, ans);
    }

    @Test
    public void test3() {
        int[] st = new int[]{1, 2, 5};
        int[] et = new int[]{3, 7, 6};
        int[] p = new int[]{10, 16, 5};
        Solution1235 solution1235 = new Solution1235();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(16, ans);
    }

    @Test
    public void test4() {
        int[] st = new int[]{1, 2, 3, 4, 6};
        int[] et = new int[]{3, 5, 10, 6, 9};
        int[] p = new int[]{20, 20, 100, 70, 60};
        Solution1235 solution1235 = new Solution1235();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(150, ans);
    }

    @Test
    public void test5() {
        int[] st = new int[]{6,  15, 7,  11, 1,  3, 16, 2};
        int[] et = new int[]{19, 18, 19, 16, 10, 8, 19, 8};
        int[] p = new int[] {2,  9,  1,  19, 5,  7, 3,  19};
        Solution1235 solution1235 = new Solution1235();
        int ans = solution1235.jobScheduling(st, et, p);
        assertEquals(41, ans);
    }

}