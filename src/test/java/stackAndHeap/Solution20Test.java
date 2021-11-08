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

    @Test
    public void test5() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("<}");
        assertFalse(res);
    }

    @Test
    public void test6() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("<1>");
        assertTrue(res);
    }

    @Test
    public void test7() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("<1>>");
        assertFalse(res);
    }

    @Test
    public void test8() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("<()>");
        assertTrue(res);
    }

    @Test
    public void test9() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("<(>)");
        assertFalse(res);
    }

    @Test
    public void test10() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("<(>)");
        assertFalse(res);
    }

    @Test
    public void test11() {
        String sss = "sss";
        sss.split("");
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("11<ff>");
        assertTrue(res);
    }

    @Test
    public void test12() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("11<f||f>");
        assertTrue(res);
    }

    @Test
    public void test13() {
        Solution20 solution20 = new Solution20();
        boolean res = solution20.isValid("11<f|f>|");
        assertFalse(res);
    }

}