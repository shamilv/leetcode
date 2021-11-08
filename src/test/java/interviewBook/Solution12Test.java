package interviewBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12Test {

    @Test
    public void test1() {
        Solution12 solution12 = new Solution12();
        boolean ans = solution12.isPermutation("ab", "ba");
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution12 solution12 = new Solution12();
        boolean ans = solution12.isPermutation("cab", "bas");
        assertFalse(ans);
    }

}