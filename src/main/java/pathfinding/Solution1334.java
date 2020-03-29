package pathfinding;

import java.util.Arrays;

public class Solution1334 {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] adj = new int[n][n];
        for (int[] a: adj)
            Arrays.fill(a, 10001);
        for (int[] edge: edges)
            adj[edge[0]][edge[1]] = adj[edge[1]][edge[0]] = edge[2];
        for (int i = 0; i < n; i++)
            adj[i][i] = 0;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int minPath = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
                    adj[i][j] = minPath;
                }
            }
        }
        int ans = 0, gmin = n;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && adj[i][j] <= distanceThreshold) {
                    curr++;
                }
            }
            if (curr <= gmin) {
                gmin = curr;
                ans = i;
            }
        }
        return ans;
    }
}
