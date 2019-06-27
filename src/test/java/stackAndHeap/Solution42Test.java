package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    public void base1() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{0, 1, 0});
        assertEquals(0, res);
    }

    @Test
    public void base2() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{1, 1, 0});
        assertEquals(0, res);
    }

    @Test
    public void base3() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{1, 0, 1});
        assertEquals(1, res);
    }

    @Test
    public void regular1() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{1, 0, 2});
        assertEquals(1, res);
    }

    @Test
    public void regular2() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{2, 0, 1, 0, 3});
        assertEquals(5, res);
    }

    @Test
    public void regular3() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{3, 0, 1, 0, 2});
        assertEquals(5, res);
    }

    @Test
    public void regular4() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{3, 0, 1, 1, 2});
        assertEquals(4, res);
    }

    @Test
    public void regular5() {
        Solution42 solution42 = new Solution42();
        int res = solution42.trap(new int[]{0, 1, 0, 3, 0, 1, 1, 2});
        assertEquals(5, res);
    }

}