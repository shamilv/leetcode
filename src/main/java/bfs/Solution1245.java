package bfs;

import java.util.Arrays;

public class Solution1245 {

    private int max = 0;

    public int treeDiameter(int[][] edges) {
        int n = edges.length + 1;
        int[][] A = new int[n + 1][n + 1];
        for (int[] a: A)
            Arrays.fill(a, -1);
        for (int i = 0; i < n; i++) {
            int[] a = edges[i];
            A[a[0]][a[1]] = a[1];
        }
        dsf(A, edges[0][0]);
        return max;
    }

    private int dsf(int[][] A, int u) {
        int l1 = 0, l2 = 0;
        for (int v : A[u]) {
            if (v == -1)
                continue;
            int val = dsf(A, v);
            if (val > l1) {
                l2 = l1;
                l1 = val;
            } else if (val > l2) {
                l2 = val;
            }
        }
        max = Math.max(max, l1 + l2);
        return l1 + 1;
    }

}
