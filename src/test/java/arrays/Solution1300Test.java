package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1300Test {

    @Test
    public void test1() {
        Solution1300 solution1300 = new Solution1300();
        int a = solution1300.findBestValue(new int[]{60864,25176,27249,21296,20204}, 56803);
        assertEquals(11361, a);
    }

    @Test
    public void test2() {
        Solution1300 solution1300 = new Solution1300();
        int a = solution1300.findBestValue(new int[]{4, 9, 3}, 10);
        assertEquals(3, a);
    }

    @Test
    public void test3() {
        Solution1300 solution1300 = new Solution1300();
        int a = solution1300.findBestValue(new int[]{2, 3, 5}, 10);
        assertEquals(5, a);
    }

}