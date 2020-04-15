package dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution200Test {

    @Test
    public void test0() {
        Solution200 solution200 = new Solution200();
        int ans = solution200.numIslands(new char[][]{});

        assertEquals(0, ans);
    }

    @Test
    public void test1() {
        Solution200 solution200 = new Solution200();
        int ans = solution200.numIslands(new char[][]{{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}});

        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        Solution200 solution200 = new Solution200();
        int ans = solution200.numIslands(new char[][]{{'1', '1', '1'}, {'0', '0', '0'}, {'1', '1', '1'}});

        assertEquals(2, ans);
    }

}