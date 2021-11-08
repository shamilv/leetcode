import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution56Test {

    @Test
    public void test1() {
        Solution56 solution56 = new Solution56();
        int[][] ans = solution56.merge(new int[][]{{1, 2}, {2, 3}});
        assertEquals(1, ans.length);
        assertArrayEquals(new int[]{1, 3}, ans[0]);
    }

    @Test
    public void test2() {
        Solution56 solution56 = new Solution56();
        int[][] ans = solution56.merge(new int[][]{{1, 2}, {2, 3}, {4, 5}});
        assertEquals(2, ans.length);
        assertArrayEquals(new int[]{1, 3}, ans[0]);
        assertArrayEquals(new int[]{4, 5}, ans[1]);
    }

    @Test
    public void test3() {
        Solution56 solution56 = new Solution56();
        int[][] ans = solution56.merge(new int[][]{{1, 2}, {1, 3}, {4, 5}});
        assertEquals(2, ans.length);
        assertArrayEquals(new int[]{1, 3}, ans[0]);
        assertArrayEquals(new int[]{4, 5}, ans[1]);
    }

    @Test
    public void test4() {
        Solution56 solution56 = new Solution56();
        int[][] ans = solution56.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertEquals(3, ans.length);
        assertArrayEquals(new int[]{1, 6}, ans[0]);
        assertArrayEquals(new int[]{8, 10}, ans[1]);
        assertArrayEquals(new int[]{15, 18}, ans[2]);
    }

    @Test
    public void test5() {
        Solution56 solution56 = new Solution56();
        int[][] ans = solution56.merge(new int[][]{{1, 6}, {2, 3}});
        assertEquals(1, ans.length);
        assertArrayEquals(new int[]{1, 6}, ans[0]);
    }
}