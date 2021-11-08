import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1684Test {

    @Test
    public void test1() {
        Solution1684 solution1684 = new Solution1684();
        int ans = solution1684.maxProfit(new int[]{2, 5}, 4);
        assertEquals(14, ans);
    }

    @Test
    public void test2() {
        Solution1684 solution1684 = new Solution1684();
        int ans = solution1684.maxProfit(new int[]{3, 5}, 6);
        assertEquals(19, ans);
    }

    @Test
    public void test3() {
        Solution1684 solution1684 = new Solution1684();
        int ans = solution1684.maxProfit(new int[]{2,8,4,10,6}, 20);
        assertEquals(110, ans);
    }
    @Test
    public void test4() {
        Solution1684 solution1684 = new Solution1684();
        int ans = solution1684.maxProfit(new int[]{1000000000}, 1000000000);
        assertEquals(21, ans);
    }

}