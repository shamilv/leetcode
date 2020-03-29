package pathfinding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1334Test {

    @Test
    public void test1() {
        int[][] edges = new int[][]{{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        Solution1334 solution1334 = new Solution1334();
        int ans = solution1334.findTheCity(4, edges, 4);
        assertEquals(3, ans);
    }

    @Test
    public void test2() {
        int[][] edges = new int[][]{{0,1,2}, {0,4,8}, {1,2,3}, {1,4,2}, {2,3,1}, {3,4,1}};
        Solution1334 solution1334 = new Solution1334();
        int ans = solution1334.findTheCity(5, edges, 2);
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        int[][] edges = new int[][]{{0,3,7}, {2,4,1}, {0,1,5}, {2,3,10}, {1,3,6}, {1,2,1}};
        Solution1334 solution1334 = new Solution1334();
        int ans = solution1334.findTheCity(6, edges, 417);
        assertEquals(5, ans);
    }

}