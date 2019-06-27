package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution215Test {

    @Test
    public void test1() {
        Solution215 solution215 = new Solution215();
        int res = solution215.findKthLargest(new int[]{2, 2, 1}, 2);
        assertEquals(2, res);
    }

    @Test
    public void test2() {
        Solution215 solution215 = new Solution215();
        int res = solution215.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);
        assertEquals(4, res);
    }

}