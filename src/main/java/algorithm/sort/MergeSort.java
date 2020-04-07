package algorithm.sort;

public class MergeSort {

    public void mergeSort(int[] A) {
        mergeSort(A, 0, A.length - 1);
    }

    private void mergeSort(int[] A, int left, int right) {
        if (left < right) {
            int mid = left + (right - left)/2;
            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);
            mergeSort(A, left, mid, right);
        }
    }

    private void mergeSort(int[] A, int left, int mid, int right) {
        int[] aux = new int[(right - left) + 1];
        int al = left, ar = mid, bl = mid + 1, br = right, index = 0;
        while (al <= ar && bl <= br) {
            if (A[al] <= A[bl])
                aux[index++] = A[al++];
            else
                aux[index++] = A[bl++];
        }
        while (al <= ar) {
            aux[index++] = A[al++];
        }
        while (bl <= br) {
            aux[index++] = A[bl++];
        }
        for (int i = 0; i < aux.length; i++) {
            A[left++] = aux[i];
        }
    }

}
