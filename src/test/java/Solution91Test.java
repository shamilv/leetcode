import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution91Test {

    @Test
    public void test1() {
        Solution91 solution91 = new Solution91();
        int ans = solution91.numDecodings("12");
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        Solution91 solution91 = new Solution91();
        int ans = solution91.numDecodings("0");
        assertEquals(0, ans);
    }

    @Test
    public void test3() {
        Solution91 solution91 = new Solution91();
        int ans = solution91.numDecodings("101");
        assertEquals(1, ans);
    }

    @Test
    public void test4() {
        Solution91 solution91 = new Solution91();
        int ans = solution91.numDecodings("226");
        assertEquals(3, ans);
    }

    @Test
    public void test5() {
        Solution91 solution91 = new Solution91();
        int ans = solution91.numDecodings("06");
        assertEquals(0, ans);
    }

}