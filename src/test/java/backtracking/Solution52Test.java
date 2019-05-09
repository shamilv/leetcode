package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution52Test {

    @Test
    public void testEdge1() {
        Solution52 solution52 = new Solution52();
        assertEquals(1, solution52.totalNQueens(1));
    }

    @Test
    public void testBase2() {
        Solution52 solution52 = new Solution52();
        assertEquals(0, solution52.totalNQueens(2));
    }

    @Test
    public void testBase3() {
        Solution52 solution52 = new Solution52();
        assertEquals(0, solution52.totalNQueens(3));
    }

    @Test
    public void testBase4() {
        Solution52 solution52 = new Solution52();
        assertEquals(2, solution52.totalNQueens(4));
    }
}