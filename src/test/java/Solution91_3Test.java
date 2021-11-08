import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution91_3Test {

    @Test
    public void test1() {
        Solution91_3 solution91 = new Solution91_3();
        int ans = solution91.numDecodings("12");
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution91_3 solution91 = new Solution91_3();
        int ans = solution91.numDecodings("0");
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution91_3 solution91 = new Solution91_3();
        int ans = solution91.numDecodings("101");
        assertEquals(1, ans);
    }

    @Test
    public void test4() {
        Solution91_3 solution91 = new Solution91_3();
        int ans = solution91.numDecodings("226");
        assertEquals(3, ans);
    }

    @Test
    public void test5() {
        Solution91_3 solution91 = new Solution91_3();
        int ans = solution91.numDecodings("06");
        assertEquals(0, ans);
    }

    @Test
    public void test6() {
        Solution91_3 solution91 = new Solution91_3();
        int ans = solution91.numDecodings("2324");
        assertEquals(4, ans);
    }

}