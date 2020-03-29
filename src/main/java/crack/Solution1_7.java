package crack;

public class Solution1_7 {

    // T.C.: O(N2)
    //S.C.: O(1)
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        int start = 0, end = matrix[0].length - 1;
        while (start < end) {
            for (int i = 0; i < matrix.length; i++) {
                int tmp = matrix[i][end];
                matrix[i][end] = matrix[i][start];
                matrix[i][start] = tmp;
            }
            start++;
            end--;
        }
    }
}
