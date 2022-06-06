package _repeatHere;

public class MergeSort {

    public void sort(int[] A) {
        if (A.length <= 1) {
            return;
        }
        int left = 0, right = A.length - 1;
        mergeSort(A, left, right);
    }
    // [1, 2, 4, 2]
    //left = 0, right = 3, mid = 2


    private void mergeSort(int[] A, int left, int right) {
        if (left == right) return;
        int mid = left + (right - left)/2;
        mergeSort(A, left, mid);
        mergeSort(A, mid + 1, right);
        merge(A, left, mid, right);
    }

    private void merge(int[] A, int left, int mid, int right) {
        int[] leftA = new int[mid - left + 1];
        int[] rightA = new int[right - mid];
        for (int i = 0; i < leftA.length; i++) {
            leftA[i] = A[left + i];
        }
        for (int i = 0; i < rightA.length; i++) {
            rightA[i] = A[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (k <= right) {
            if (i < leftA.length && j == rightA.length) {
                A[k] = leftA[i++];
            } else if (i == leftA.length && j < rightA.length) {
                A[k] = rightA[j++];
            } else if (leftA[i] <= rightA[j]) {
                A[k] = leftA[i++];
            } else {
                A[k] = rightA[j++];
            }
            k++;
        }
    }
}
