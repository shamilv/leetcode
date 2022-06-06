package _repeatHere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void test1() {
        int[] A = new int[]{2, 1, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(A);
        assertArrayEquals(new int[]{1, 2, 3}, A);
    }

    @Test
    public void test2() {
        int[] A = new int[]{2, 4, 5, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(A);
        assertArrayEquals(new int[]{2, 3, 4, 5}, A);
    }

    @Test
    public void test3() {
        int[] A = new int[]{2, 1, 4, 5, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(A);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, A);
    }

    @Test
    public void test4() {
        int[] A = new int[]{7, 8, 9, 5, 4, 1, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(A);
        assertArrayEquals(new int[]{1, 3, 4, 5, 7, 8, 9}, A);
    }

}