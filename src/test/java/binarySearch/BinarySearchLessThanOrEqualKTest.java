package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchLessThanOrEqualKTest {

    @Test
    public void test1() {
        BinarySearchLessThanOrEqualK binarySearchLessThanOrEqualK = new BinarySearchLessThanOrEqualK();
        int ans = binarySearchLessThanOrEqualK.binarySearchLessThanOrEqualK(new int[]{1, 2, 3}, 2);
        assertEquals(1, ans);
    }

    @Test
    public void test2() {
        BinarySearchLessThanOrEqualK binarySearchLessThanOrEqualK = new BinarySearchLessThanOrEqualK();
        int ans = binarySearchLessThanOrEqualK.binarySearchLessThanOrEqualK(new int[]{1, 2, 3}, 3);
        assertEquals(2, ans);
    }

    @Test
    public void test3() {
        BinarySearchLessThanOrEqualK binarySearchLessThanOrEqualK = new BinarySearchLessThanOrEqualK();
        int ans = binarySearchLessThanOrEqualK.binarySearchLessThanOrEqualK(new int[]{1, 2, 5, 7}, 4);
        assertEquals(1, ans);
    }

    @Test
    public void test4() {
        BinarySearchLessThanOrEqualK binarySearchLessThanOrEqualK = new BinarySearchLessThanOrEqualK();
        int ans = binarySearchLessThanOrEqualK.binarySearchLessThanOrEqualK(new int[]{1, 2, 5, 7}, 1);
        assertEquals(0, ans);
    }

}