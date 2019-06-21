package stackAndHeap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution20Test {

    @Test
    public void test() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("");
        assertTrue(res);
    }

    @Test
    public void test1() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("()");
        assertTrue(res);
    }

    @Test
    public void test2() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("[({})]");
        assertTrue(res);
    }

    @Test
    public void test3() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("[({))]");
        assertFalse(res);
    }

    @Test
    public void test4() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("}");
        assertFalse(res);
    }

}