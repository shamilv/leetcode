package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution496Test {

    @Test
    public void base1() {
        Solution496 solution496 = new Solution496();
        int[] res = solution496.nextGreaterElement(new int[]{1}, new int[]{1});
        assertArrayEquals(new int[]{-1}, res);
    }

    @Test
    public void base2() {
        Solution496 solution496 = new Solution496();
        int[] res = solution496.nextGreaterElement(new int[]{}, new int[]{1});
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    public void base3() {
        Solution496 solution496 = new Solution496();
        int[] res = solution496.nextGreaterElement(new int[]{4, 5}, new int[]{1, 5, 4, 2});
        assertArrayEquals(new int[]{-1, -1}, res);
    }

    @Test
    public void test() {
        Solution496 solution496 = new Solution496();
        int[] res = solution496.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        assertArrayEquals(new int[]{-1, 3, -1}, res);
    }

    @Test
    public void test2() {
        Solution496 solution496 = new Solution496();
        int[] res = solution496.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{3, -1}, res);
    }

}