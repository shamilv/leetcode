package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution53Test {

    @Test
    public void edgeCase1() {
        Solution53 solution53 = new Solution53();
        int res = solution53.maxSubArray(new int[]{1});
        assertEquals(1, res);
    }

    @Test
    public void edgeCase_1() {
        Solution53 solution53 = new Solution53();
        int res = solution53.maxSubArray(new int[]{-1});
        assertEquals(-1, res);
    }

    @Test
    public void edgeCase12() {
        Solution53 solution53 = new Solution53();
        int res = solution53.maxSubArray(new int[]{1, 2});
        assertEquals(3, res);
    }

    @Test
    public void edgeCase_1_2() {
        Solution53 solution53 = new Solution53();
        int res = solution53.maxSubArray(new int[]{-1, -2});
        assertEquals(-1, res);
    }

    @Test
    public void edgeCase2_2_315_2() {
        Solution53 solution53 = new Solution53();
        int res = solution53.maxSubArray(new int[]{2, -2, -3, 1, 5, -2});
        assertEquals(6, res);
    }

}