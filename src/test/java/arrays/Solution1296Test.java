package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1296Test {

    @Test
    public void test1() {
        Solution1296 solution1296 = new Solution1296();
        boolean ans = solution1296.isPossibleDivide(new int[]{1, 2, 3, 3, 4, 4, 5, 6}, 4);
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution1296 solution1296 = new Solution1296();
        boolean ans = solution1296.isPossibleDivide(new int[]{5,6,7,8,9,6,7,8,9,10,11,12,13,14,15,12,13,14,15,19}, 5);
        assertTrue(ans);
    }

}