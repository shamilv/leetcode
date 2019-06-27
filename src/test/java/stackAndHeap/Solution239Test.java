package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution239Test {

    @Test
    public void base1() {
        Solution239 solution239 = new Solution239();
        int[] res = solution239.maxSlidingWindow(new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, res);
    }

    @Test
    public void base2() {
        Solution239 solution239 = new Solution239();
        int[] res = solution239.maxSlidingWindow(new int[]{1,2}, 1);
        assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    public void base3() {
        Solution239 solution239 = new Solution239();
        int[] res = solution239.maxSlidingWindow(new int[]{1, 2, 0, -1}, 2);
        assertArrayEquals(new int[]{2, 2, 0}, res);
    }

    @Test
    public void test() {
        Solution239 solution239 = new Solution239();
        int[] res = solution239.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, res);
    }

}