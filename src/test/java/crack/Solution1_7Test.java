package crack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1_7Test {

    @Test
    public void test1() {
        Solution1_7 solution1_7 = new Solution1_7();
        int[][] in = new int[][]{{1}};
        solution1_7.rotate(in);
        int[][] exp = new int[][]{{1}};
        assertArrayEquals(exp, in);
    }

    @Test
    public void test2() {
        Solution1_7 solution1_7 = new Solution1_7();
        int[][] in = new int[][]{{1, 2}, {3, 4}};
        solution1_7.rotate(in);
        int[][] exp = new int[][]{{3, 1}, {4, 2}};
        assertArrayEquals(exp, in);
    }

    @Test
    public void test3() {
        Solution1_7 solution1_7 = new Solution1_7();
        int[][] in = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution1_7.rotate(in);
        int[][] exp = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(exp, in);
    }

}