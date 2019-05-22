package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    @Test
    public void test() {
        Solution5 solution5 = new Solution5();
        String res = solution5.longestPalindrome("aa");
        assertEquals("aa", res);
    }

    @Test
    public void test2() {
        Solution5 solution5 = new Solution5();
        String res = solution5.longestPalindrome("ac");
        assertEquals("a", res);
    }

    @Test
    public void test3() {
        Solution5 solution5 = new Solution5();
        String res = solution5.longestPalindrome("aca");
        assertEquals("aca", res);
    }

    @Test
    public void test4() {
        Solution5 solution5 = new Solution5();
        String res = solution5.longestPalindrome("aaxcnc");
        assertEquals("cnc", res);
    }

}