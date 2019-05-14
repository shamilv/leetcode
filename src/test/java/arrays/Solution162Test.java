package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution162Test {

    @Test
    public void test1() {
        Solution162 solution162 = new Solution162();
        int index = solution162.findPeakElement(new int[]{1});
        assertEquals(0, index);
    }

    @Test
    public void test2() {
        Solution162 solution162 = new Solution162();
        int index = solution162.findPeakElement(new int[]{1, 2});
        assertEquals(1, index);
    }

    @Test
    public void test3() {
        Solution162 solution162 = new Solution162();
        int index = solution162.findPeakElement(new int[]{1, 2, 3});
        assertEquals(2, index);
    }

    @Test
    public void test4() {
        Solution162 solution162 = new Solution162();
        int index = solution162.findPeakElement(new int[]{3, 2, 1});
        assertEquals(0, index);
    }

    @Test
    public void test5() {
        Solution162 solution162 = new Solution162();
        int index = solution162.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        assertEquals(5, index);
    }

}