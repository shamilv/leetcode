package algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    public void test1() {
        int[] A = new int[]{2, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(A);
        assertArrayEquals(new int[]{1, 2}, A);
    }

    @Test
    public void test2() {
        int[] A = new int[]{2, 3, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(A);
        assertArrayEquals(new int[]{1, 2, 3}, A);
    }

    @Test
    public void test3() {
        int[] A = new int[]{2, 3, 1, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(A);
        assertArrayEquals(new int[]{1, 2, 3, 4}, A);
    }

    @Test
    public void test4() {
        int[] A = new int[]{2, 3, 4, 1, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(A);
        assertArrayEquals(new int[]{1, 2, 3, 4, 4}, A);
    }

}