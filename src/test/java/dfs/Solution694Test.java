package dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution694Test {

    @Test
    public void test1() {
        int[][] grid = new int[][] {
                {0,0,1,0,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0},
                {0,0,1,0,0,1,1,1,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,1,1,0,1,0,0,0},
                {0,1,0,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,0,0,0,1,1,1,1,1,0,0,1,0,0,1,0},
                {1,0,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,1,1}};

        Solution694 solution694 = new Solution694();
        int asn = solution694.numDistinctIslands(grid);
        assertEquals(15, asn);
    }

    @Test
    public void test2() {
        int[][] grid = new int[][] {
                {1,1,0},
                {0,1,1},
                {0,0,0},
                {1,1,1},
                {0,1,0}};

        Solution694 solution694 = new Solution694();
        int asn = solution694.numDistinctIslands(grid);
        assertEquals(2, asn);
    }

}