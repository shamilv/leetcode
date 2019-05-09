package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution79Test {

    @Test
    public void testBase1() {
        Solution79 solution79 = new Solution79();
        char[][] board = new char[][]{{'a', 'b'}};
        assertTrue(solution79.exist(board, "ba"));
    }

    @Test
    public void testBase2() {
        Solution79 solution79 = new Solution79();
        char[][] board = new char[][]{{'a', 'a'}};
        assertFalse(solution79.exist(board, "aaa"));
    }

    @Test
    public void testRegular1() {
        Solution79 solution79 = new Solution79();
        char[][] board = new char[][]{{'A', 'B', 'C'}, {'B', 'D', 'F'}};
        assertTrue(solution79.exist(board, "BDF"));
    }

    @Test
    public void testRegular2() {
        Solution79 solution79 = new Solution79();
        char[][] board = new char[][]{{'A', 'B', 'C'}, {'B', 'D', 'F'}};
        assertFalse(solution79.exist(board, "BDQ"));
    }

    @Test
    public void testRegular3() {
        Solution79 solution79 = new Solution79();
        char[][] board = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        assertTrue(solution79.exist(board, "AAB"));
    }

}