package algorithm.graph;

import java.util.Arrays;

public class Dijkstra {

    public int[] dijkstra(int[][] G, int n, int s) {
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        ans[s] = 0;
        boolean[] v = new boolean[n];
        Integer i;
        while ((i = getNext(ans, v)) != -1) {
            for (int j = 0; j < G[i].length; j++) {
                if (v[j]) continue;
                if (G[i][j] != 0 && (ans[j] == -1 || ans[i] + G[i][j] < ans[j])) {
                    ans[j] = ans[i] + G[i][j];
                }
            }
            v[i] = true;
        }
        return ans;
    }

    private Integer getNext(int[] ans, boolean[] v) {
        Integer min = -1, index = -1;
        for (int i = 0; i < ans.length; i++) {
            if (v[i]) continue;
            if (ans[i] != -1 && (min == -1 || min >= ans[i])) {
                min = ans[i];
                index = i;
            }
        }
        return index;
    }

}
