package binarySearch;

public class BinarySearchLessThanK {

    public int binarySearchLessThanK(int[] A, int K) {
        int left = 0, right = A.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (A[mid] < K) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return ans;
    }
}
