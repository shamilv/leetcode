package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution670Test {

    @Test
    public void baseCase() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(11);
        assertEquals(11, res);
    }

    @Test
    public void baseCase2() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(12);
        assertEquals(21, res);
    }

    @Test
    public void baseCase3() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(21);
        assertEquals(21, res);
    }

    @Test
    public void regularCase4() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(78009);
        assertEquals(98007, res);
    }

    @Test
    public void regularCase5() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(11543);
        assertEquals(51143, res);
    }

    @Test
    public void regularCase6() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(2736);
        assertEquals(7236, res);
    }

    @Test
    public void regularCase7() {
        Solution670 solution670 = new Solution670();
        int res = solution670.maximumSwap(1993);
        assertEquals(9913, res);
    }


}