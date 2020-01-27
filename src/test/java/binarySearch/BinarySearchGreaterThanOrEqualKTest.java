package binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchGreaterThanOrEqualKTest {

    @Test
    public void test1() {
        BinarySearchGreaterThanOrEqualK binarySearchGreaterThanOrEqualK = new BinarySearchGreaterThanOrEqualK();
        int ans = binarySearchGreaterThanOrEqualK.binarySearchGreaterThanOrEqualK(new int[]{1, 3, 5, 7}, 4);
        assertEquals(2, ans);
    }

    @Test
    public void test2() {
        BinarySearchGreaterThanOrEqualK binarySearchGreaterThanOrEqualK = new BinarySearchGreaterThanOrEqualK();
        int ans = binarySearchGreaterThanOrEqualK.binarySearchGreaterThanOrEqualK(new int[]{1, 3, 5, 7}, 5);
        assertEquals(2, ans);
    }

    @Test
    public void test3() {
        BinarySearchGreaterThanOrEqualK binarySearchGreaterThanOrEqualK = new BinarySearchGreaterThanOrEqualK();
        int ans = binarySearchGreaterThanOrEqualK.binarySearchGreaterThanOrEqualK(new int[]{1, 3, 5, 7}, 7);
        assertEquals(3, ans);
    }

    @Test
    public void test4() {
        BinarySearchGreaterThanOrEqualK binarySearchGreaterThanOrEqualK = new BinarySearchGreaterThanOrEqualK();
        int ans = binarySearchGreaterThanOrEqualK.binarySearchGreaterThanOrEqualK(new int[]{1, 3, 5, 7}, 8);
        assertEquals(-1, ans);
    }


}