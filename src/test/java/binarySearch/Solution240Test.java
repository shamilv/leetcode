package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution240Test {

    private int[][] matrix = new int[][]{{1, 4, 7, 11, 15},
                                         {2, 5, 8, 12, 19},
                                         {3, 6, 9, 16, 22},
                                         {10, 13, 14, 17, 24},
                                         {18, 21, 23, 26, 30}};

    @Test
    public void test1() {
        Solution240 solution240 = new Solution240();
        boolean ans = solution240.searchMatrix(matrix, 5);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution240 solution240 = new Solution240();
        boolean ans = solution240.searchMatrix(matrix, 15);
        assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution240 solution240 = new Solution240();
        boolean ans = solution240.searchMatrix(matrix, 0);
        assertFalse(ans);
    }

    @Test
    public void test4() {
        Solution240 solution240 = new Solution240();
        boolean ans = solution240.searchMatrix(matrix, 20);
        assertFalse(ans);
    }

    @Test
    public void test5() {
        Solution240 solution240 = new Solution240();
        boolean ans = solution240.searchMatrix(new int[][]{{}}, 20);
        assertFalse(ans);
    }

}