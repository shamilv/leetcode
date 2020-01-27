package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binarySearchLessThanKTest {

    @Test
    public void test1() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{1, 2, 3}, 5);
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{1, 2, 3}, 3);
        assertEquals(1, ans);
    }

    @Test
    public void test3() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{1, 2, 3}, 2);
        assertEquals(0, ans);
    }


    @Test
    public void test4() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{2, 3, 4, 5}, 6);
        assertEquals(3, ans);
    }

    @Test
    public void test5() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{2, 3, 4, 5}, 5);
        assertEquals(2, ans);
    }

    @Test
    public void test6() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{2, 3, 4, 5}, 4);
        assertEquals(1, ans);
    }

    @Test
    public void test7() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{2, 3, 4, 5}, 3);
        assertEquals(0, ans);
    }

    @Test
    public void test8() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{2, 3, 4, 5}, 2);
        assertEquals(-1, ans);
    }

    @Test
    public void test9() {
        BinarySearchLessThanK binarySearchLessThanK = new BinarySearchLessThanK();
        int ans = binarySearchLessThanK.binarySearchLessThanK(new int[]{2, 3, 4, 5}, 0);
        assertEquals(-1, ans);
    }

}