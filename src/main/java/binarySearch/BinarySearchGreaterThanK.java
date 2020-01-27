package binarySearch;

public class BinarySearchGreaterThanK {

    public int binarySearchLessThanK(int[] A, int K) {
        int left = 0, right = A.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (A[mid] > K) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }
}
