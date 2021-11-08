package interviewBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution14Test {

    @Test
    public void test1() {
        Solution14 solution14 = new Solution14();
        boolean ans = solution14.isPermutation("aa");
        assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution14 solution14 = new Solution14();
        boolean ans = solution14.isPermutation("aab");
        assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution14 solution14 = new Solution14();
        boolean ans = solution14.isPermutation("aacb");
        assertFalse(ans);
    }

    @Test
    public void test4() {
        Solution14 solution14 = new Solution14();
        boolean ans = solution14.isPermutation("Taco beleb ocat");
        assertTrue(ans);
    }

}