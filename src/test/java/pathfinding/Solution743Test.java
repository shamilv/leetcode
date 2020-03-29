package pathfinding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution743Test {

    @Test
    public void test1() {
        int[][] times = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        Solution743 solution743 = new Solution743();
        int ans = solution743.networkDelayTime(times, 4, 2);
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        int[][] times = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        Solution743 solution743 = new Solution743();
        int ans = solution743.networkDelayTime(times, 4, 1);
        assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        int[][] times = new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 3}, {2, 4, 5}, {3, 4, 3}};
        Solution743 solution743 = new Solution743();
        int ans = solution743.networkDelayTime(times, 4, 1);
        assertEquals(5, ans);
    }

}