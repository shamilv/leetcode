package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void test1() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{1};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1});
    }

    @Test
    public void test2() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{1, 2};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2});
    }

    @Test
    public void test3() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{2, 1};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2});
    }

    @Test
    public void test4() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{2, 1, 3};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2, 3});
    }

    @Test
    public void test5() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{3, 1, 2};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2, 3});
    }

    @Test
    public void test6() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{3, 2, 1};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2, 3});
    }

    @Test
    public void test7() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{3, 2, 1, 4};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2, 3, 4});
    }

    @Test
    public void test8() {
        QuickSort quickSort = new QuickSort();
        int[] A = new int[]{3, 2, 4, 1};
        quickSort.quckSort(A);
        assertArrayEquals(A, new int[]{1, 2, 3, 4});
    }

}