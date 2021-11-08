import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1567Test {
    @Test
    public void test1() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{0});
        assertEquals(0, ans);
    }

    @Test
    public void test2() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{1});
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{-1});
        assertEquals(0, ans);
    }

    @Test
    public void test4() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{1, 2, 3});
        assertEquals(3, ans);
    }

    @Test
    public void test5() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{1, -2, 3, 4});
        assertEquals(2, ans);
    }

    @Test
    public void test6() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{1, -2, -3, 4});
        assertEquals(4, ans);
    }

    @Test
    public void test7() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{1, 0, -2, 3, 4});
        assertEquals(2, ans);
    }

    @Test
    public void test8() {
        Solution1567 solution1567 = new Solution1567();
        int ans = solution1567.getMaxLen(new int[]{1, 0, -2, -3, 4});
        assertEquals(3, ans);
    }
}