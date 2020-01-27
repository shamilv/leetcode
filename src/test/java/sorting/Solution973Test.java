package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution973Test {

    @Test
    public void test1() {
        Solution973 solution973 = new Solution973();
        int[][] ans = solution973.kClosest(new int[][]{{1,3},{-2,2}}, 1);
        int[][] exp = new int[][]{{-2, 2}};
        assertArrayEquals(exp, ans);
    }

    @Test
    public void test2() {
        Solution973 solution973 = new Solution973();
        int[][] ans = solution973.kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2);
        int[][] exp = new int[][]{{3, 3}, {-2, 4}};
        assertArrayEquals(exp, ans);
    }

    @Test
    public void test3() {
        Solution973 solution973 = new Solution973();
        int[][] ans = solution973.kClosest(new int[][]{{-2,10},{-4,-8},{10,7},{-4,-7}}, 3);
        int[][] exp = new int[][]{{-4, -7}, {-4, -8}, {-2, 10}};
        assertArrayEquals(exp, ans);
    }

}