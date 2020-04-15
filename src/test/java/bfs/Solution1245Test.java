package bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1245Test {

    @Test
    public void test() {
        Solution1245 solution1245 = new Solution1245();
        int ans = solution1245.treeDiameter(new int[][]{{0,1}, {0,2}});
        assertEquals(2, ans);
    }

}