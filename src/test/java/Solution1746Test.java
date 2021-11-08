import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1746Test {

    @Test
    public void test1() {
        Solution1746 solution1746 = new Solution1746();
        int ans = solution1746.maxSumAfterOperation_2(new int[]{2, -1, -4, -3});
        assertEquals(17, ans);
    }

    @Test
    public void test2() {
        Solution1746 solution1746 = new Solution1746();
        int ans = solution1746.maxSumAfterOperation_2(new int[]{1, -1, 1, 1, -1, -1, 1});
        assertEquals(4, ans);
    }

}