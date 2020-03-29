package sorting;

public class QuickSort {

    public void quckSort(int[] A) {
        quckSort(A, 0, A.length - 1);
    }

    private void quckSort(int[] A, int left, int right) {
        if (left >= right) return;
        int pivot = A[left], lb = left, ub = right;
        while (lb < ub) {
            while (lb < right && A[lb] <= pivot)
                lb++;
            while (ub > left && A[ub] > pivot)
                ub--;
            if (lb < ub) {
                swap(A, lb, ub);
                lb++;
                ub--;
            }
        }
        if (left < ub)
            swap(A, left, ub);
        quckSort(A, left, ub - 1);
        quckSort(A, ub + 1, right);
    }

    private void swap(int[] A, int left, int right) {
        int tmp = A[left];
        A[left] = A[right];
        A[right] = tmp;
    }

}
