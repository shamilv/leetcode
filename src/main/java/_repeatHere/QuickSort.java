package _repeatHere;

public class QuickSort {
    public void sort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }
    // [2, 1, 3]
    // [2, 3, 4, 5]
    //0, 3, 1
    //2, 3, 2
    private void quickSort(int[] A, int left, int right) {
        if (left == right) return;
        int pivot = left + (right - left)/2;
        int i = left, j = right;
        while (i < j) {
            while (A[i] < A[pivot]) {
                i++;
            }
            while (A[j] > A[pivot]) {
                j--;
            }
            if (i < j) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
                i++;
                j--;
            }
        }
        quickSort(A, left, pivot);
        quickSort(A, pivot + 1, right);
    }
}
