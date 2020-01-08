package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    public void test() {
        Solution29 solution29 = new Solution29();
        int res = solution29.divide(10, 3);

        assertEquals(3, res);
    }

    @Test
    public void test2() {
        Solution29 solution29 = new Solution29();
        int res = solution29.divide(-1, 1);

        assertEquals(-1, res);
    }

    @Test
    public void test3() {
        Solution29 solution29 = new Solution29();
        int res = solution29.divide(-2147483648, -1);

        assertEquals(-1, res);
    }


}