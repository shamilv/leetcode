package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution875Test {

    @Test
    public void test1() {
        Solution875 solution875 = new Solution875();
        int res = solution875.minEatingSpeed(new int[]{3,6,7,11}, 8);
        assertEquals(4, res);
    }

    @Test
    public void test2() {
        Solution875 solution875 = new Solution875();
        int res = solution875.minEatingSpeed(new int[]{30,11,23,4,20}, 5);
        assertEquals(30, res);
    }

    @Test
    public void test3() {
        Solution875 solution875 = new Solution875();
        int res = solution875.minEatingSpeed(new int[]{332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728, 941802184},
                823855818);
        assertEquals(14, res);
    }

}