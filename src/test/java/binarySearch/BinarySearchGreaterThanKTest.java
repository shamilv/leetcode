package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchGreaterThanKTest {

    @Test
    public void test1() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3}, 3);
        assertEquals(-1, ans);
    }

    @Test
    public void test2() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3}, 4);
        assertEquals(-1, ans);
    }

    @Test
    public void test3() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3}, 2);
        assertEquals(2, ans);
    }

    @Test
    public void test4() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3, 4}, 2);
        assertEquals(2, ans);
    }

    @Test
    public void test5() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3, 4}, 3);
        assertEquals(3, ans);
    }

    @Test
    public void test6() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3, 4}, 0);
        assertEquals(0, ans);
    }

    @Test
    public void test7() {
        BinarySearchGreaterThanK binarySearchGreaterThanK = new BinarySearchGreaterThanK();
        int ans = binarySearchGreaterThanK.binarySearchLessThanK(new int[]{1, 2, 3, 4}, -1);
        assertEquals(0, ans);
    }

}