package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1167Test {

    @Test
    public void test1() {
        Solution1167 solution1167 = new Solution1167();
        int cost = solution1167.connectSticks(new int[]{2, 4, 3});
        assertEquals(14, cost);
    }

    @Test
    public void test2() {
        Solution1167 solution1167 = new Solution1167();
        int cost = solution1167.connectSticks(new int[]{1, 8, 3, 5});
        assertEquals(30, cost);
    }

    @Test
    public void test3() {
        Solution1167 solution1167 = new Solution1167();
        int cost = solution1167.connectSticks(new int[]{1});
        assertEquals(0, cost);
    }

    @Test
    public void test4() {
        Solution1167 solution1167 = new Solution1167();
        int cost = solution1167.connectSticks(new int[]{1, 2, 1});
        assertEquals(6, cost);
    }

    @Test
    public void test5() {
        Solution1167 solution1167 = new Solution1167();
        int cost = solution1167.connectSticks(new int[]{3354,4316,3259,4904,4598,474,3166,6322,8080,9009});
        assertEquals(151646, cost);
    }

    @Test
    public void test6() {
        Solution1167 solution1167 = new Solution1167();
        int cost = solution1167.connectSticks(new int[]{2, 3, 3, 3});
        assertEquals(22, cost);
    }
}