package binarySearch;

public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int idx = findBinary(matrix, 0, matrix.length - 1, 0, target);
        if (idx == -1) return false;
        if (matrix[idx][0] == target) return true;
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] <= target && matrix[idx][j] >= target) {
                int i = findBinary(matrix, 0, idx, j, target);
                if (i != -1 && matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    private int findBinary(int[][] matrix, int bottom, int top, int j, int k) {
        int ans = -1;
        while (bottom <= top) {
            int mid = bottom + (top - bottom)/2;
            if (matrix[mid][j] == k)
                return mid;
            else if (matrix[mid][j] > k) {
                top = mid - 1;
            } else {
                ans = mid;
                bottom = mid + 1;
            }
        }
        return ans;
    }

}
