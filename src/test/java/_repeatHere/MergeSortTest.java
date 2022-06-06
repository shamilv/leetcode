package _repeatHere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    public void test1() {
        int[] A = new int[]{2, 1, 3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(A);
        assertArrayEquals(new int[]{1, 2, 3}, A);
    }

    @Test
    public void test2() {
        int[] A = new int[]{2, 1, 2, 3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(A);
        assertArrayEquals(new int[]{1, 2, 2, 3}, A);
    }

    @Test
    public void test3() {
        int[] A = new int[]{2, 1, 2, 3, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(A);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, A);
    }

    @Test
    public void test4() {
        int[] A = new int[]{2, 1, 2, -3, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(A);
        assertArrayEquals(new int[]{-3, 1, 2, 2, 4}, A);
    }

}