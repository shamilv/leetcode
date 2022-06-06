package _repeatHere;

public class QuickSelect {
    public void quickSelect(int[] A, int k) {
        quickSelect(A, 0, A.length - 1, k);
    }

    //[2, 1, 3, 4, 7, 5]
    //[4, 3, 5, 1], k =2
    //[1, 2, 3, 4], k =2
    //[2, 2, 4, 1], k =2
    //[7, 8, 3, 5, 4, 1, 9], k = 3
    private void quickSelect(int[] A, int left, int right, int k) {
        if (left == right) return;
        int i = left, j = right;
        while (i < j) {
            while (A[i] < A[k - 1]) {
                i++;
            }
            while (A[j] >= A[k - 1]) {
                j--;
            }
            if (i >= j) {
                return;
            } else {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }
        }
    }
}
