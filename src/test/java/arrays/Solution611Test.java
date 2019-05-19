package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution611Test {

    @Test
    public void testBaseCase() {
        Solution611 solution611 = new Solution611();
        int res = solution611.triangleNumber(new int[]{1, 2, 3});
        assertEquals(0, res);
    }

    @Test
    public void testBaseCase2() {
        Solution611 solution611 = new Solution611();
        int res = solution611.triangleNumber(new int[]{2, 2, 3});
        assertEquals(1, res);
    }

    @Test
    public void testBaseCase3() {
        Solution611 solution611 = new Solution611();
        int res = solution611.triangleNumber(new int[]{3, 3, 4, 6});
        assertEquals(3, res);
    }

}