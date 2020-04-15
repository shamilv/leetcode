package dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution947Test {

    @Test
    public void test1() {
        Solution947 solution947 = new Solution947();
        int ans = solution947.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}});
        assertEquals(5, ans);
    }

    @Test
    public void test2() {
        Solution947 solution947 = new Solution947();
        int ans = solution947.removeStones(new int[][]{{0,0}});
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution947 solution947 = new Solution947();
        int ans = solution947.removeStones(new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}});
        assertEquals(3, ans);
    }

    @Test
    public void test4() {
        Solution947 solution947 = new Solution947();
        int ans = solution947.removeStones(new int[][]{{3,2},{3,1},{4,4},{1,1},{0,2},{4,0}});
        assertEquals(4, ans);
    }

}