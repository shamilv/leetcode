package binarySearch;

import java.util.Arrays;

public class Solution1099 {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int ans = -1;
        for (int i = 0; i < A.length - 1; i++) {
            int idx = binary(A, K - A[i], i + 1);
            if (idx != -1)
                ans = Math.max(ans, A[i] + A[idx]);
        }
        return ans;
    }

    private int binary(int[] A, int K, int start) {
        int l = start, r = A.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (A[mid] < K) {
                l = mid + 1;
                ans = mid;
            } else
                r = mid - 1;
        }
        return ans;
    }
}
