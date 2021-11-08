import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution221_2_2Test {
    @Test
    public void test1() {
        char[][] matrix = new char[][]{{'0'}};
        Solution221_2 solution221 = new Solution221_2();
        int ans = solution221.maximalSquare(matrix);
        assertEquals(0, ans);
    }

    @Test
    public void test2() {
        char[][] matrix = new char[][]{{'0', '0', '1'}};
        Solution221_2 solution221 = new Solution221_2();
        int ans = solution221.maximalSquare(matrix);
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        char[][] matrix = new char[][]{{'0', '1'}, {'1', '1'}};
        Solution221_2 solution221 = new Solution221_2();
        int ans = solution221.maximalSquare(matrix);
        assertEquals(1, ans);
    }

    @Test
    public void test4() {
        char[][] matrix = new char[][]{{'1', '1', '0'}, {'1', '1', '0'}};
        Solution221_2 solution221 = new Solution221_2();
        int ans = solution221.maximalSquare(matrix);
        assertEquals(4, ans);
    }

    @Test
    public void test5() {
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '1', '1', '0'}};
        Solution221_2 solution221 = new Solution221_2();
        int ans = solution221.maximalSquare(matrix);
        assertEquals(4, ans);
    }

    @Test
    public void test6() {
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '1', '1', '1'}};
        Solution221_2 Solution221_2 = new Solution221_2();
        int ans = Solution221_2.maximalSquare(matrix);
        assertEquals(9, ans);
    }

    @Test
    public void test7() {
        char[][] matrix = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '1', '1', '0'}, {'1', '1', '1', '1', '1'}, {'1', '0', '1', '1', '1'}, {'0', '0', '1', '1', '1'}};
        Solution221_2 solution221 = new Solution221_2();
        int ans = solution221.maximalSquare(matrix);
        assertEquals(9, ans);
    }
}